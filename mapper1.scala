#!/usr/bin/env scala
for (line <- io.Source.stdin.getLines) {
  line.replaceAll("\\p{Punct}", "").toLowerCase.split("\\s").foreach(x=>println(s"$x\t1"))
}