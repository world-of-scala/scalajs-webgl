package org.worldofscala.scalajswebgl.domain.errors

import sttp.model.StatusCode

final case class HttpError(
  statusCode: StatusCode,
  message: String,
  cause: Throwable
) extends RuntimeException(message, cause)

object HttpError {
  def decode(tuple: (StatusCode, String)) =
    HttpError(tuple._1, tuple._2, new RuntimeException(tuple._2))
  def encode(error: Throwable) =
    error match
      case NotHostHeaderException        => (StatusCode.BadRequest, error.getMessage())
      case UnauthorizedException(msg)    => (StatusCode.Unauthorized, msg)
      case TooYoungException(_)          => (StatusCode.BadRequest, error.getMessage())
      case InvalidCredentialsException() => (StatusCode.Unauthorized, error.getMessage())
      case UserAlreadyExistsException()  => (StatusCode.Conflict, error.getMessage())
      case _                             => (StatusCode.InternalServerError, error.getMessage())
}
