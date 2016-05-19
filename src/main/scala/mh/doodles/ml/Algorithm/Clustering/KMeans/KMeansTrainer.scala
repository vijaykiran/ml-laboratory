package mh.doodles.ml.Algorithm.Clustering.KMeans

import mh.doodles.ml.Algorithm.{POINT, CONTENDER_LIST, CLUSTER, MLTrainer}

class KMeansTrainer extends MLTrainer {

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

  /** take input data and translate it into a form we can use for machine learning
    *
    * @param inputDataPath - path to input data file .csv
    * @return
    */
  override def parseRawData(inputDataPath: String, separator: Char): CLUSTER = ???

  /** train a kmeans algorithm with the provided settings
    *
    * @param settings - a series of values used in training a KMeansTrainer model
    */
  override def train(settings: Map[String, Any]): CONTENDER_LIST = ???

  /** model tuning stage, select best model output statistics
    *
    * @param models - a set of models produced by out trainer
    */
  override def evaluate(models: CONTENDER_LIST): CLUSTER = ???

  /** perform predictions on test data set using our best produced model
    *
    * @param settings - settings for predict
    */
  override def predict(settings: Map[String, Any]): Boolean = ???

  /** select a random point from our prepared data set
    *
    * @param seed - random seed
    * @return
    */
  def chooseRandomPoint(seed: Int): Set[POINT] = ???
}

/** Default settings for our KMeansTrainer */
case class KMeansTrainingDefaults(// KMeans
                                  val K: Int = 2,
                                  val ITERATIONS: Int = 10,
                                  val RUNS: Int = 3,
                                  val TRAINING_DATA: CLUSTER = Set(Seq(1, 2, 3), Seq(4, 5, 6), Seq(7, 8, 9)),
                                  // I | O
                                  val STAGED_PATH: String = "/working-dir/staged/",
                                  val OUTPUT_PATH: String = "/working-dir/out/")
