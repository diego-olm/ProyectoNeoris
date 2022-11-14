package neoris.app;

import demo.MiJdbc;
import test.MiFactory;

public class MiShutdownHook extends Thread
{
	@Override
public void run() {
		MiJdbc x = MiFactory.getInstance("miJdbc");
		x.disconnect();
	}
}
