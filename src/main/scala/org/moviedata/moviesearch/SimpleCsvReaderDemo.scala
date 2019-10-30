package org.moviedata.moviesearch

object SimpleCsvReaderDemo extends App {

  val relativePath: String = "src/test/resources/data/"
  val filename = "simple_testsample.csv"

  val bufferedSource = io.Source.fromFile(relativePath + filename)

  println("id original_title release_date revenue runtime status vote_average vote_count")
  // read CSV rows (ignoring header)
  for (line <- bufferedSource.getLines().drop(1)) {
    val Array(id,original_title,release_date,revenue,runtime,status,vote_average,vote_count) = line.split(",").map(_.trim)
    println(s"$id $original_title $release_date $revenue $runtime $status $vote_average $vote_count")
  }
  bufferedSource.close()
}
