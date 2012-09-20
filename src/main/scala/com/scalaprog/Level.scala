package com.scalaprog

case class Level(code: String)

case class Error(value: String = "Error") extends Level(value)

case class Warn(value: String = "Warn") extends Level(value)

case class Info(value: String = "Info") extends Level(value)

case class Debug(value: String = "Debug") extends Level(value)

case class Trace(value: String = "Trace") extends Level(value)