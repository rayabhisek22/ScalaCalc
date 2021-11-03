name := "Calc2"

version := "0.1"

scalaVersion := "2.11.1"

resolvers += "jobserver" at "https://sparkjobserver.jfrog.io/artifactory/jobserver"

libraryDependencies += "spark.jobserver" %% "job-server-api" % "0.8.1" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"




