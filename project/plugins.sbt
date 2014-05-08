
resolvers ++= Seq(
  "twitter.com" at "http://maven.twttr.com/",
  "maven" at "http://repo1.maven.org/maven2/",
  "freemarker" at "http://freemarker.sourceforge.net/maven2/",
  "local" at ("file:" + System.getProperty("user.home") + "/.m2/repository/"))

libraryDependencies ++= Seq(
    "org.slf4j"              % "slf4j-api"          % "1.6.1",
    "org.slf4j"              % "slf4j-simple"       % "1.6.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.7.0-RC2")
