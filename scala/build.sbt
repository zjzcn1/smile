name := "smile-scala"

// Parent project disables Scala as most libraries are in Java.
// Enable it as this is a Scala project.
crossPaths := true

autoScalaLibrary := true

target in Compile in doc := baseDirectory.value / "../src/universal/doc/api/scala"

scalacOptions in (Compile, doc) ++= Seq("-doc-title", "SMILE -- Statistical Machine Intelligence and Learning Engine")

libraryDependencies += "com.thoughtworks.xstream" % "xstream" % "1.4.8"