package com.metaweb.gridworks.commands.edit;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

import com.metaweb.gridworks.commands.EngineDependentCommand;
import com.metaweb.gridworks.model.AbstractOperation;
import com.metaweb.gridworks.model.operations.ColumnAdditionOperation;

public class AddColumnCommand extends EngineDependentCommand {
	@Override
	protected AbstractOperation createOperation(HttpServletRequest request,
			JSONObject engineConfig) throws Exception {
		
		int baseCellIndex = Integer.parseInt(request.getParameter("baseCellIndex"));
		String expression = request.getParameter("expression");
		String headerLabel = request.getParameter("headerLabel");
		int columnInsertIndex = Integer.parseInt(request.getParameter("columnInsertIndex"));
		
		return new ColumnAdditionOperation(
			engineConfig, 
			baseCellIndex, 
			expression,
			headerLabel,
			columnInsertIndex
		);
	}

}
