package mh.doodles.ml.Algorithm

import mh.doodles.ml.Algorithm.Clustering.KMeans.KMeansTrainingConfig

/** class to be extended by all machine learning algorithm trainers */
trait MLTrainer {

  val appPrefix = "mh.doodles.algorithms.ml."

  def parseRawData(inputDataPath: String, separator: Char): Cluster

  def train(settings: KMeansTrainingConfig): Contenders

  def evaluate(models: Contenders): Cluster

  def predict(settings: Map[String, Any]): Boolean
}