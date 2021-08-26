/*
 * Esta aplicacion es parte de los paquetes bancarios propiedad de COBISCORP.
 * Su uso no autorizado queda expresamente prohibido asi como cualquier
 * alteracion o agregado hecho por alguno de sus usuarios sin el debido
 * consentimiento por escrito de COBISCORP.
 * Este programa esta protegido por la ley de derechos de autor y por las
 * convenciones internacionales de propiedad intelectual. Su uso no
 * autorizado dara derecho a COBISCORP para obtener ordenes de secuestro
 * o retencion y para perseguir penalmente a los autores de cualquier infraccion.
 */
package com.cobiscorp.cobis.lnspr.oprtn.test;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.impl.*;

public class AccountsOperationForm{

	public static final GridCatalog3Items gridCatalog3Items = Singleton.getInstance(GridCatalog3Items.class);
	private AccountsOperationForm() {
		throw new IllegalStateException("AccountsOperationForm is a utility class");
	}
	
	public static class GridCatalog3Items extends COBISGrid {
		public GridCatalog3Items() {
			this.init("QV_SEPR_PJZ89", "QV_SEPR_PJZ89");
		} 

		public static final Code code = Singleton.getInstance(Code.class);
		public static final Value1 value1 = Singleton.getInstance(Value1.class);
		public static final Value2 value2 = Singleton.getInstance(Value2.class);

		public static class Code extends COBISInputValue {
			public Code() {
				this.init("VA_CODEPVDENMQQIAZ_575826","Cuenta");
			}
		}			

		public static class Value1 extends COBISInputValue {
			public Value1() {
				this.init("VA_VALUE1XWKWSEKJY_872826","CodCliente");
			}
		}			

		public static class Value2 extends COBISInputValue {
			public Value2() {
				this.init("VA_VALUE2UGGNUVHED_858826","NombreCliente");
			}
		}			
	}
}
