package com.vogella.tasks.ui.parts;
import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.e4.ui.services.EMenuService;

public class TodoOverviewPart {
	
	@PostConstruct
	public void createControls(Composite parent, EMenuService menuService) {
	    System.out.println(this.getClass().getSimpleName()
	    + " @PostConstruct method called.");
	    
	    System.out.println(menuService.registerContextMenu(getClass(), "com.vogella.tasks.ui.popupmenu.table"));
	    
	}
	
}
