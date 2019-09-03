package spacebuilder2020.random_enderio_addons.conduits;

import java.util.logging.Level;
import java.util.logging.Logger;

import crazypants.enderio.conduit.AbstractConduitNetwork;

public class EUConduitNetwork extends AbstractConduitNetwork<IEUConduit, IEUConduit> {

	public EUConduitNetwork() {
		super(EUAbstractConduit.class, EUAbstractConduit.class);
		// TODO Auto-generated constructor stub
		Logger.getGlobal().log(Level.INFO,"Network created");
	}

}
