package mh.doodles.ml.Algorithm.Clustering

import mh.doodles.ml.Algorithm.Clustering.KMeans.KMeansTrainingConfig
import mh.doodles.ml.Algorithm.{Cluster, Contenders}

/** class to be extended by all machine learning algorithm labelers */
trait Labeler {

  val appPrefix = "mh.doodles.algorithms.ml."

  def parseRawData(inputDataPath: String, separator: Char): Cluster

  def train(settings: KMeansTrainingConfig): Contenders

  def evaluate(models: Contenders): Cluster

  def predict(settings: Map[String, Any]): Boolean
}
