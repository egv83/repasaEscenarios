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

public class OperationItemsForm{

	public static final GridOperationItemsList gridOperationItemsList = Singleton.getInstance(GridOperationItemsList.class);
	private OperationItemsForm() {
		throw new IllegalStateException("OperationItemsForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587 btnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587 = Singleton.getInstance(BtnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587.class);
		
		public static class BtnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587 extends COBISButton{
			public BtnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587 () {
				this.init("VA_VAVABUTTONTR__P_260587", "Guardar");
			}
		}
	

	}
	
	
	public static class GridOperationItemsList extends COBISGrid {
		public GridOperationItemsList() {
			this.init("QV_MC21_OVS27", "QV_MC21_OVS27");
		} 

		public static final Item item = Singleton.getInstance(Item.class);
		public static final Description description = Singleton.getInstance(Description.class);
		public static final TypeItem typeItem = Singleton.getInstance(TypeItem.class);
		public static final OtherRates otherRates = Singleton.getInstance(OtherRates.class);
		public static final PaymentMethod paymentMethod = Singleton.getInstance(PaymentMethod.class);
		public static final Signo signo = Singleton.getInstance(Signo.class);
		public static final Priority priority = Singleton.getInstance(Priority.class);
		public static final Factor factor = Singleton.getInstance(Factor.class);
		public static final Reference reference = Singleton.getInstance(Reference.class);
		public static final SignReadjustment signReadjustment = Singleton.getInstance(SignReadjustment.class);
		public static final ReferenceReadjustment referenceReadjustment = Singleton.getInstance(ReferenceReadjustment.class);
		public static final FactorReadjustment factorReadjustment = Singleton.getInstance(FactorReadjustment.class);
		public static final CalculationBase calculationBase = Singleton.getInstance(CalculationBase.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final Percentage percentage = Singleton.getInstance(Percentage.class);
		public static final PayArrears payArrears = Singleton.getInstance(PayArrears.class);
		public static final Cause cause = Singleton.getInstance(Cause.class);
		public static final Points points = Singleton.getInstance(Points.class);
		public static final TypePoints typePoints = Singleton.getInstance(TypePoints.class);
		public static final TotalRate totalRate = Singleton.getInstance(TotalRate.class);
		public static final NegotiatedRate negotiatedRate = Singleton.getInstance(NegotiatedRate.class);
		public static final AnnualRate annualRate = Singleton.getInstance(AnnualRate.class);
		public static final PointsReadjustment pointsReadjustment = Singleton.getInstance(PointsReadjustment.class);
		public static final Grace grace = Singleton.getInstance(Grace.class);
		public static final Receivable receivable = Singleton.getInstance(Receivable.class);
		public static final WarrantyType warrantyType = Singleton.getInstance(WarrantyType.class);
		public static final WarrantyAccount warrantyAccount = Singleton.getInstance(WarrantyAccount.class);
		public static final WarrantyCoverage warrantyCoverage = Singleton.getInstance(WarrantyCoverage.class);
		public static final WarrantyValue warrantyValue = Singleton.getInstance(WarrantyValue.class);
		public static final DividendType dividendType = Singleton.getInstance(DividendType.class);
		public static final InterestPeriods interestPeriods = Singleton.getInstance(InterestPeriods.class);
		public static final Financed financed = Singleton.getInstance(Financed.class);
		public static final MinRate minRate = Singleton.getInstance(MinRate.class);
		public static final MaxRate maxRate = Singleton.getInstance(MaxRate.class);
		public static final Associate associate = Singleton.getInstance(Associate.class);
		public static final AssociateValue associateValue = Singleton.getInstance(AssociateValue.class);

		public static class Item extends COBISInputValue {
			public Item() {
				this.init("VA_ITEMWXVWWWSCMKV_983587","Rubro");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_DESCRIPTIONRKNO_269587","Descripcion");
			}
		}			

		public static class TypeItem extends COBISInputValue {
			public TypeItem() {
				this.init("VA_TYPEITEMJIPMXHQ_437587","Tipo");
			}
		}			

		public static class OtherRates extends COBISInputValue {
			public OtherRates() {
				this.init("VA_OTHERRATESSNGBH_206587","OtherRates");
			}
		}			

		public static class PaymentMethod extends COBISInputValue {
			public PaymentMethod() {
				this.init("VA_PAYMENTMETHODDD_439587","FormaPago");
			}
		}			

		public static class Signo extends COBISInputValue {
			public Signo() {
				this.init("VA_SIGNOPVGZZIPUAD_330587","Signo");
			}
		}			

		public static class Priority extends COBISInputValue {
			public Priority() {
				this.init("VA_PRIORITYKZVVIRF_388587","Prioridad");
			}
		}			

		public static class Factor extends COBISInputValue {
			public Factor() {
				this.init("VA_FACTORFVQAPPLTX_853587","Factor");
			}
		}			

		public static class Reference extends COBISInputValue {
			public Reference() {
				this.init("VA_REFERENCEGBROYB_738587","Referencial");
			}
		}			

		public static class SignReadjustment extends COBISInputValue {
			public SignReadjustment() {
				this.init("VA_SIGNREADJUSTNEN_335587","SignoReajuste");
			}
		}			

		public static class ReferenceReadjustment extends COBISInputValue {
			public ReferenceReadjustment() {
				this.init("VA_REFERENCEREANET_690587","RefReajuste");
			}
		}			

		public static class FactorReadjustment extends COBISInputValue {
			public FactorReadjustment() {
				this.init("VA_FACTORREADJUTET_483587","FactorReajuste");
			}
		}			

		public static class CalculationBase extends COBISInputValue {
			public CalculationBase() {
				this.init("VA_CALCULATIONBASA_240587","BasedeCalculo");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_AMOUNTJGMPZXMXY_754587","Valor");
			}
		}			

		public static class Percentage extends COBISInputValue {
			public Percentage() {
				this.init("VA_PERCENTAGEJLTCZ_260587","Tasa");
			}
		}			

		public static class PayArrears extends COBISInputValue {
			public PayArrears() {
				this.init("VA_PAYARREARSBOUUR_140587","PayArrears");
			}
		}			

		public static class Cause extends COBISInputValue {
			public Cause() {
				this.init("VA_CAUSEUVCCDEPMIA_289587","Cause");
			}
		}			

		public static class Points extends COBISInputValue {
			public Points() {
				this.init("VA_POINTSTESVMWKGH_733587","Points");
			}
		}			

		public static class TypePoints extends COBISInputValue {
			public TypePoints() {
				this.init("VA_TYPEPOINTSDTBQI_258587","TypePoints");
			}
		}			

		public static class TotalRate extends COBISInputValue {
			public TotalRate() {
				this.init("VA_TOTALRATEOPJMMR_803587","TotalRate");
			}
		}			

		public static class NegotiatedRate extends COBISInputValue {
			public NegotiatedRate() {
				this.init("VA_NEGOTIATEDRAETT_876587","NegotiatedRate");
			}
		}			

		public static class AnnualRate extends COBISInputValue {
			public AnnualRate() {
				this.init("VA_ANNUALRATESVRXQ_786587","AnnualRate");
			}
		}			

		public static class PointsReadjustment extends COBISInputValue {
			public PointsReadjustment() {
				this.init("VA_POINTSREADJUTTS_146587","PointsReadjustment");
			}
		}			

		public static class Grace extends COBISInputValue {
			public Grace() {
				this.init("VA_GRACEGYKAMZUODA_972587","Grace");
			}
		}			

		public static class Receivable extends COBISInputValue {
			public Receivable() {
				this.init("VA_RECEIVABLEUNHZR_405587","Receivable");
			}
		}			

		public static class WarrantyType extends COBISInputValue {
			public WarrantyType() {
				this.init("VA_WARRANTYTYPETIJ_651587","WarrantyType");
			}
		}			

		public static class WarrantyAccount extends COBISInputValue {
			public WarrantyAccount() {
				this.init("VA_WARRANTYACCOUUU_368587","WarrantyAccount");
			}
		}			

		public static class WarrantyCoverage extends COBISInputValue {
			public WarrantyCoverage() {
				this.init("VA_WARRANTYCOVEREG_147587","WarrantyCoverage");
			}
		}			

		public static class WarrantyValue extends COBISInputValue {
			public WarrantyValue() {
				this.init("VA_WARRANTYVALUEEE_381587","WarrantyValue");
			}
		}			

		public static class DividendType extends COBISInputValue {
			public DividendType() {
				this.init("VA_DIVIDENDTYPEOCS_467587","DividendType");
			}
		}			

		public static class InterestPeriods extends COBISInputValue {
			public InterestPeriods() {
				this.init("VA_INTERESTPERIDDD_253587","InterestPeriods");
			}
		}			

		public static class Financed extends COBISDropDownList {
			public Financed() {
				this.init("VA_FINANCEDWVNAAPN_415587","Financiado");
			}
		}			

		public static class MinRate extends COBISInputValue {
			public MinRate() {
				this.init("VA_MINRATEJNRPYQJS_276587","TasaMin");
			}
		}			

		public static class MaxRate extends COBISInputValue {
			public MaxRate() {
				this.init("VA_MAXRATENSHCMIGD_796587","TasaMax");
			}
		}			

		public static class Associate extends COBISInputValue {
			public Associate() {
				this.init("VA_TEXTINPUTBOXNAY_879587","RefAsociada");
			}
		}			

		public static class AssociateValue extends COBISInputValue {
			public AssociateValue() {
				this.init("VA_TEXTINPUTBOXXQV_567587","ValorRefAsociada");
			}
		}			
	}
}
