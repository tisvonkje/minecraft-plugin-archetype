package ${package};

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * ${artifactId} java plugin
 */
public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("${artifactId}");

  public void onEnable()
  {
    LOGGER.info("${artifactId} enabled");
  }

  public void onDisable()
  {
    LOGGER.info("${artifactId} disabled");
  }
}
