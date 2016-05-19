package mh.doodles.ml.Algorithm.Clustering

import mh.doodles.ml.Algorithm.{CONTENDER_LIST, CLUSTER}
import mh.doodles.ml.Algorithm.Clustering.KMeans.KMeansLabelerDefaults

/** class to be extended by all machine learning algorithm labelers */
abstract class Labeler {

  val appPrefix = "mh.doodles.algorithms.ml."

  def toString: String

  def parseRawData(inputDataPath: String, separator: Char): CLUSTER

  def train(settings: Map[String, Any] = KMeansLabelerDefaults): CONTENDER_LIST

  def evaluate(models: CONTENDER_LIST): CLUSTER

  def predict(settings: Map[String, Any]): Boolean
}
