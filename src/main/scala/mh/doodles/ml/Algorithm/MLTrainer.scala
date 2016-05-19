package mh.doodles.ml.Algorithm

import mh.doodles.ml.Algorithm.Clustering.KMeans.KMeansTrainingDefaults

/** class to be extended by all machine learning algorithm trainers */
abstract class MLTrainer {

  val appPrefix = "mh.doodles.algorithms.ml."

  def toString: String

  def parseRawData(inputDataPath: String, separator: Char): CLUSTER

  def train(settings: Map[String, Any] = KMeansTrainingDefaults): CONTENDER_LIST

  def evaluate(models: CONTENDER_LIST): CLUSTER

  def predict(settings: Map[String, Any]): Boolean
}