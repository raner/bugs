package top.java

import java.io.InputStream

class BrokenCode
{
	def ClassLoader getLoader(Class<?> type)
	{
		type.classLoader
	}

    def InputStream loadResource(String path)
    {
    	val ClassLoader classLoader = class.classLoader
    	classLoader.getResourceAsStream(path)
    }
}