package mh.doodles.ml

import mh.doodles.ml.Algorithm.Clustering.KMeans.{KMeansLabelerDefaults, KMeansTrainingDefaults}

object Main {

  /** entry point for our application
    *
    * @param args - arguments passed to application
    */
  def main(args: Array[String]): Unit = {

    // establish the type of application we are running
    // todo: generalize this method for other algorithms
    val appType = args.headOption.getOrElse("kmeans.trainer")

    /** define a tentative list of application arguments
      *
      * @param properties - application property list
      */
    def interpretArgs(properties: Array[String] = args.tail): Map[String, Any] = {
      /** parse arguments passed to our application
        *
        * @param property - specific property to look for in our args
        * @return
        */
      def getProperty(property: String): String = properties.
        flatMap(_.split(",")).filter(_.head == property).tail.asInstanceOf[Option[String]].get

      appType match {
        case AppType.TRAINER => KMeansTrainingDefaults(getProperty("k").toInt)
        case AppType.LABELER => KMeansLabelerDefaults(getProperty("l"))
      }
    }
  }
}


object AppType {
  val TRAINER = "kmeans.trainer"
  val LABELER = "kmeans.labeler"
}
