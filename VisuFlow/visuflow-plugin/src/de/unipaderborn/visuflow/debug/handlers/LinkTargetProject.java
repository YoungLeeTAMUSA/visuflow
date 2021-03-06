package de.unipaderborn.visuflow.debug.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @author Zafar Habeeb
 *
 */
public class LinkTargetProject extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		TargetHandlerDialog targetHandler = new TargetHandlerDialog(window.getShell());
		targetHandler.open();
		return null;
	}
	
}