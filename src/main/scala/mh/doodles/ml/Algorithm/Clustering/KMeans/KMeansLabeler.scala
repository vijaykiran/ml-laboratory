package mh.doodles.ml.Algorithm.Clustering.KMeans

import mh.doodles.ml.Algorithm.Clustering.Labeler
import mh.doodles.ml.Algorithm.{Cluster, Contenders}

class KMeansLabeler extends Labeler {

  /** when asked for toString return the name of the algorithm
    *
    * @return - the name of the ml algorithm
    */
  override def toString: String = appPrefix + "KMeansTrainer"

  /** Translate what the user settings provided for training
    *
    * @param propertyList - list of training properties
    */
  def configureTraining(propertyList: Map[String, Any]): Unit = ???

  override def parseRawData(inputDataPath: String, separator: Char): Cluster = ???

  override def evaluate(models: Contenders): Cluster = ???

  override def train(settings: KMeansTrainingConfig): Contenders = ???

  override def predict(settings: Map[String, Any]): Boolean = ???
}

/** Default settings for our KMeansLabeler */
case class KMeansLabelerConfig(model: Cluster = 123.asInstanceOf[Cluster],
                               LABELING_DATA: Cluster = Set(Seq(1, 2, 3), Seq(4, 5, 6), Seq(7, 8, 9)),
                               STAGED_PATH: String = "/working-dir/staged/",
                               OUTPUT_PATH: String = "/working-dir/out/")
