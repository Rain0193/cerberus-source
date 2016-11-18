/* Cerberus  Copyright (C) 2013  vertigo17
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
* This file is part of Cerberus.
*
* Cerberus is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* Cerberus is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with Cerberus.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.cerberus.engine.gwt;

import org.cerberus.crud.entity.TestCaseStepActionExecution;
import org.cerberus.exception.CerberusEventException;

/**
 * {Insert class description here}
 *
 * @author Corentin Vanson
 * @version 1.0, 20/10/2016
 * @since 2.0.0
 */
public interface IVariableService {

    public String decodeVariableWithExistingObject(String stringToDecode, TestCaseStepActionExecution testCaseStepActionExecution, boolean forceCalculation) throws CerberusEventException;

}