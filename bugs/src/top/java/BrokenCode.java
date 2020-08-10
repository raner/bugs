package top.java;

import java.io.InputStream;

@SuppressWarnings("all")
public class BrokenCode {
  public ClassLoader getLoader(final Class<?> type) {
    return type.getClassLoader();
  }
  
  public InputStream loadResource(final String path) {
    InputStream _xblockexpression = null;
    {
      final ClassLoader classLoader = this.getClass().getClassLoader();
      _xblockexpression = classLoader.getResourceAsStream(path);
    }
    return _xblockexpression;
  }
}
