package org.processmining.plugins.pnml.exporting;

import java.io.File;
import java.io.IOException;

import org.processmining.framework.plugin.PluginContext;
import org.processmining.framework.plugin.annotations.Plugin;
import org.processmining.framework.plugin.annotations.PluginLevel;
import org.processmining.framework.plugin.annotations.PluginVariant;
import org.processmining.models.graphbased.directed.opennet.OpenNet;
import org.processmining.models.graphbased.directed.petrinet.Petrinet;
import org.processmining.models.graphbased.directed.petrinet.configurable.impl.ConfigurableResetInhibitorNet;
import org.processmining.plugins.pnml.base.Pnml;

public class PnmlExportNetToPNML extends PnmlExportNet {

	public void exportPetriNetToPNMLFile(Petrinet net, File file) throws IOException {
		exportPetriNetToPNMLOrEPNMLFile(net, file, Pnml.PnmlType.PNML);
	}

	public void exportPetriNetToPNMLFile(OpenNet openNet, File file) throws IOException {
		exportPetriNetToPNMLOrEPNMLFile(openNet, file, Pnml.PnmlType.PNML);
	}

	public void exportPetriNetToPNMLFile(ConfigurableResetInhibitorNet configurableNet, File file) throws IOException {
		exportPetriNetToPNMLOrEPNMLFile(configurableNet, file, Pnml.PnmlType.PNML);
	}
}
