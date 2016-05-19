package mh.doodles.ml.Algorithm.Clustering.KMeans

import mh.doodles.ml.Algorithm.{CONTENDER_LIST, CLUSTER}
import mh.doodles.ml.Algorithm.Clustering.Labeler

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

  override def parseRawData(inputDataPath: String, separator: Char): CLUSTER = ???

  override def evaluate(models: CONTENDER_LIST): CLUSTER = ???

  override def train(settings: Map[String, Any]): CONTENDER_LIST = ???

  override def predict(settings: Map[String, Any]): Boolean = ???
}

/** Default settings for our KMeansLabeler */
case class KMeansLabelerDefaults(val MODEL: CLUSTER = 123.asInstanceOf[CLUSTER],
                                 val LABELING_DATA: CLUSTER = Set(Seq(1, 2, 3), Seq(4, 5, 6), Seq(7, 8, 9)),
                                 val STAGED_PATH: String = "/working-dir/staged/",
                                 val OUTPUT_PATH: String = "/working-dir/out/"
                                )