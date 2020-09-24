package app

import org.slf4j.LoggerFactory

object Main extends App {  
	lazy val version: String = BuildInfo.version
	val logger = LoggerFactory.getLogger(Main.getClass)
	logger.info(s"================= Application start - \${BuildInfo.name}");
	logger.info(s"====== version: \${BuildInfo.version}");
	logger.info(s"====== build: \${BuildInfo.buildInfoBuildNumber}");
	logger.info(s"====== home directory: \${System.getProperty("user.home")}");
}
