/*  Copyright 2015-2017 Stanford University                                                                                                                                       
 *                                                                                                                                                                               
 *  Licensed under the Apache License, Version 2.0 (the "License");                                                                                                               
 *  you may not use this file except in compliance with the License.                                                                                                              
 *  You may obtain a copy of the License at                                                                                                                                       
                                                                                                                                                                                
 *      http://www.apache.org/licenses/LICENSE-2.0                                                                                                                                
                                                                                                                                                                                
 *  Unless required by applicable law or agreed to in writing, software                                                                                                           
 *  distributed under the License is distributed on an "AS IS" BASIS,                                                                                                             
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.                                                                                                      
 *  See the License for the specific language governing permissions and                                                                                                           
 *  limitations under the License. 
 */

package glade.constants.program;

import glade.constants.Files;
import glade.program.ProgramDataUtils.MultiFileProgramExamples;
import glade.program.ProgramDataUtils.ProgramData;
import glade.program.ProgramDataUtils.ProgramExamples;
import glade.program.ProgramDataUtils.ShellProgramData;
import glade.util.OracleUtils.IdentityWrapper;
import glade.util.Utils.ConstantFilter;
import glade.util.Utils.Filter;

public class FlexData {
	public static final String FLEX_GCOV = "flex/flex-2.6.0";
	public static final String FLEX_EXE = "flex/flex-2.6.0/src/flex";
	public static final boolean FLEX_IS_ERROR = true;
	
	public static final String FLEX_EXTENSION = ".lex";
	public static final String FLEX_EMPTY = "%%\n%%";
	
	public static final String FLEX_NAME = "flex";
	public static final ProgramData FLEX_DATA = new ShellProgramData(Files.FILE_PARAMETERS, FLEX_EXE, FLEX_GCOV, FLEX_IS_ERROR);
	public static final ProgramExamples FLEX_EXAMPLES = new MultiFileProgramExamples(Files.FILE_PARAMETERS, FLEX_NAME, FLEX_EXTENSION, FLEX_EMPTY, new IdentityWrapper());
	public static final Filter<String> FLEX_FILTER = new ConstantFilter<String>(true);
}
