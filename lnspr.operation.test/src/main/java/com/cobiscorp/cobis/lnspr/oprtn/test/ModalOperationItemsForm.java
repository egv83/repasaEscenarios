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

public class ModalOperationItemsForm{
	public static final OperationItemsList operationItemsList = Singleton.getInstance(OperationItemsList.class);

	private ModalOperationItemsForm() {
		throw new IllegalStateException("ModalOperationItemsForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMMODALOPENNN cmdCommand1IdCMMODALOPENNN = Singleton.getInstance(CmdCommand1IdCMMODALOPENNN.class);
		
		public static class CmdCommand1IdCMMODALOPENNN extends COBISButton{
			public CmdCommand1IdCMMODALOPENNN () {
				this.init("CM_MODALOPE_NNN", "Guardar");
			}
		}
	
		public static final CmdCommand2IdCMMODALOPE7TL cmdCommand2IdCMMODALOPE7TL = Singleton.getInstance(CmdCommand2IdCMMODALOPE7TL.class);
		
		public static class CmdCommand2IdCMMODALOPE7TL extends COBISButton{
			public CmdCommand2IdCMMODALOPE7TL () {
				this.init("CM_MODALOPE_7TL", "Cancelar");
			}
		}
	

	}
	

	public static class OperationItemsList {
	
		private OperationItemsList() {
			throw new IllegalStateException("ModalOperationItemsForm is a utility class");
		}
		
		public static final Item item = Singleton.getInstance(Item.class);
		public static final Description description = Singleton.getInstance(Description.class);
		public static final TypeItem typeItem = Singleton.getInstance(TypeItem.class);
		public static final PaymentMethod paymentMethod = Singleton.getInstance(PaymentMethod.class);
		public static final Financed financed = Singleton.getInstance(Financed.class);
		public static final Priority priority = Singleton.getInstance(Priority.class);
		public static final Reference reference = Singleton.getInstance(Reference.class);
		public static final Signo signo = Singleton.getInstance(Signo.class);
		public static final Factor factor = Singleton.getInstance(Factor.class);
		public static final Associate associate = Singleton.getInstance(Associate.class);
		public static final AssociateValue associateValue = Singleton.getInstance(AssociateValue.class);
		public static final MinRate minRate = Singleton.getInstance(MinRate.class);
		public static final Percentage percentage = Singleton.getInstance(Percentage.class);
		public static final MaxRate maxRate = Singleton.getInstance(MaxRate.class);
		public static final ReferenceReadjustment referenceReadjustment = Singleton.getInstance(ReferenceReadjustment.class);
		public static final SignReadjustment signReadjustment = Singleton.getInstance(SignReadjustment.class);
		public static final FactorReadjustment factorReadjustment = Singleton.getInstance(FactorReadjustment.class);
		public static final CalculationBase calculationBase = Singleton.getInstance(CalculationBase.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);

		public static class Item extends COBISDropDownList {
			public Item() {
				this.init("VA_ITEMUCXHLKNWSIV_574800","Rubro");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_DESCRIPTIONZKOW_324800","Descripcion");
			}
		}			

		public static class TypeItem extends COBISInputValue {
			public TypeItem() {
				this.init("VA_TYPEITEMDSHZMXA_943800","Tipo");
			}
		}			

		public static class PaymentMethod extends COBISDropDownList {
			public PaymentMethod() {
				this.init("VA_PAYMENTMETHODDD_767800","FormaPago");
			}
		}			

		public static class Financed extends COBISDropDownList {
			public Financed() {
				this.init("VA_FINANCEDTQRTUFB_342800","Financiado");
			}
		}			

		public static class Priority extends COBISInputValue {
			public Priority() {
				this.init("VA_PRIORITYGWEJSIO_703800","Prioridad");
			}
		}			

		public static class Reference extends COBISDropDownList {
			public Reference() {
				this.init("VA_REFERENCESIEQUP_560800","Referencial");
			}
		}			

		public static class Signo extends COBISDropDownList {
			public Signo() {
				this.init("VA_SIGNOOZSLFEAGNU_871800","Signo");
			}
		}			

		public static class Factor extends COBISInputValue {
			public Factor() {
				this.init("VA_FACTORTDKMIRESJ_493800","Factor");
			}
		}			

		public static class Associate extends COBISInputValue {
			public Associate() {
				this.init("VA_ASSOCIATETDSBLB_140800","RefAsociada");
			}
		}			

		public static class AssociateValue extends COBISInputValue {
			public AssociateValue() {
				this.init("VA_ASSOCIATEVALEUU_342800","ValorRefAsociada");
			}
		}			

		public static class MinRate extends COBISInputValue {
			public MinRate() {
				this.init("VA_MINRATELDEORMJX_638800","Minima");
			}
		}			

		public static class Percentage extends COBISInputValue {
			public Percentage() {
				this.init("VA_PERCENTAGEOQEOK_815800","Tasa");
			}
		}			

		public static class MaxRate extends COBISInputValue {
			public MaxRate() {
				this.init("VA_MAXRATEVBDOKWML_251800","Maxima");
			}
		}			

		public static class ReferenceReadjustment extends COBISDropDownList {
			public ReferenceReadjustment() {
				this.init("VA_REFERENCEREADSD_344800","RefReajuste");
			}
		}			

		public static class SignReadjustment extends COBISDropDownList {
			public SignReadjustment() {
				this.init("VA_SIGNREADJUSTEEM_203800","SignoReajuste");
			}
		}			

		public static class FactorReadjustment extends COBISInputValue {
			public FactorReadjustment() {
				this.init("VA_FACTORREADJUTTE_305800","FactorReajuste");
			}
		}			

		public static class CalculationBase extends COBISInputValue {
			public CalculationBase() {
				this.init("VA_CALCULATIONBEEE_756800","BasedeCalculo");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_AMOUNTKDNIXSXCQ_807800","Valor");
			}
		}			
	}
}
