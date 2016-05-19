package mh.doodles.ml

package object Algorithm {

  // baseline terms, concepts
  type FACT = Any
  type SUBJECT = Seq[FACT]
  type DATA = Set[SUBJECT]

  // more evolved terms, concepts
  type FEATURE = Double
  type POINT = Seq[Double]
  type CLUSTER = Set[POINT]
  type CONTENDER_LIST = Set[CLUSTER]

}