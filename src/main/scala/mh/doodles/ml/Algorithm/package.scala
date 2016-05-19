package mh.doodles.ml

package object Algorithm {

  // baseline terms, concepts
  type Fact = Any
  type Subject = Seq[Fact]
  type Data = Set[Subject]

  // more evolved terms, concepts
  type Feature = Double
  type Point = Seq[Double]
  type Cluster = Set[Point]
  type Contenders = Set[Cluster]

}