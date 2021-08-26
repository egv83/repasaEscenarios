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

public class PaymentsConciliationFormForm{
	public static final PaymentConciliation paymentConciliation = Singleton.getInstance(PaymentConciliation.class);
	public static final ConciliationsList conciliationsList = Singleton.getInstance(ConciliationsList.class);

	public static final GridPaymentConciliationDetailList gridPaymentConciliationDetailList = Singleton.getInstance(GridPaymentConciliationDetailList.class);
	public static final GridPaymentConciliationHeader gridPaymentConciliationHeader = Singleton.getInstance(GridPaymentConciliationHeader.class);
	private PaymentsConciliationFormForm() {
		throw new IllegalStateException("PaymentsConciliationFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTLNSPRXO4K6 cmdCommand1IdCMTLNSPRXO4K6 = Singleton.getInstance(CmdCommand1IdCMTLNSPRXO4K6.class);
		
		public static class CmdCommand1IdCMTLNSPRXO4K6 extends COBISButton{
			public CmdCommand1IdCMTLNSPRXO4K6 () {
				this.init("CM_TLNSPRXO_4K6", "Conciliar");
			}
		}
	
		public static final CmdCommand2IdCMTLNSPRXOS0T cmdCommand2IdCMTLNSPRXOS0T = Singleton.getInstance(CmdCommand2IdCMTLNSPRXOS0T.class);
		
		public static class CmdCommand2IdCMTLNSPRXOS0T extends COBISButton{
			public CmdCommand2IdCMTLNSPRXOS0T () {
				this.init("CM_TLNSPRXO_S0T", "Limpiar");
			}
		}
	
		public static final BtnVAVABUTTONZTYSATF616186IdVAVABUTTONZTYSATF616186 btnVAVABUTTONZTYSATF616186IdVAVABUTTONZTYSATF616186 = Singleton.getInstance(BtnVAVABUTTONZTYSATF616186IdVAVABUTTONZTYSATF616186.class);
		
		public static class BtnVAVABUTTONZTYSATF616186IdVAVABUTTONZTYSATF616186 extends COBISButton{
			public BtnVAVABUTTONZTYSATF616186IdVAVABUTTONZTYSATF616186 () {
				this.init("VA_VABUTTONZTYSATF_616186", "Buscar");
			}
		}
	

	}
	

	public static class PaymentConciliation {
	
		private PaymentConciliation() {
			throw new IllegalStateException("PaymentsConciliationFormForm is a utility class");
		}
		
		public static final Date date = Singleton.getInstance(Date.class);
		public static final Channel channel = Singleton.getInstance(Channel.class);
		public static final File file = Singleton.getInstance(File.class);

		public static class Date extends COBISDatePicker {
			public Date() {
				this.init("VA_DATEXZBCXHFOVZR_141186","Fecha");
			}
		}			

		public static class Channel extends COBISDropDownList {
			public Channel() {
				this.init("VA_CHANNELWEXMHDXO_774186","Canal");
			}
		}			

		public static class File extends COBISFileUpload {
			public File() {
				this.init("VA_FILESZZATNNOGJP_910186","CargarArchivo");
			}
		}			
	}

	public static class ConciliationsList {
	
		private ConciliationsList() {
			throw new IllegalStateException("PaymentsConciliationFormForm is a utility class");
		}
		
		public static final Conciliation conciliation = Singleton.getInstance(Conciliation.class);

		public static class Conciliation extends COBISDropDownList {
			public Conciliation() {
				this.init("VA_CONCILIATIONRZV_347186","Conciliaciones");
			}
		}			
	}
	
	public static class GridPaymentConciliationDetailList extends COBISGrid {
		public GridPaymentConciliationDetailList() {
			this.init("QV_WB70_IUL83", "QV_WB70_IUL83");
		} 

		public static final RegisterTypeD registerTypeD = Singleton.getInstance(RegisterTypeD.class);
		public static final SupplyNumberD supplyNumberD = Singleton.getInstance(SupplyNumberD.class);
		public static final PaymentDateD paymentDateD = Singleton.getInstance(PaymentDateD.class);
		public static final TerminalIdD terminalIdD = Singleton.getInstance(TerminalIdD.class);
		public static final ConvertedAmountDebtD convertedAmountDebtD = Singleton.getInstance(ConvertedAmountDebtD.class);
		public static final ConvertedComissionD convertedComissionD = Singleton.getInstance(ConvertedComissionD.class);
		public static final ConvertedConcept convertedConcept = Singleton.getInstance(ConvertedConcept.class);
		public static final ConvertedTotalAmountD convertedTotalAmountD = Singleton.getInstance(ConvertedTotalAmountD.class);
		public static final TransactionNumverD transactionNumverD = Singleton.getInstance(TransactionNumverD.class);
		public static final OperationNumberD operationNumberD = Singleton.getInstance(OperationNumberD.class);
		public static final BillNumberD billNumberD = Singleton.getInstance(BillNumberD.class);
		public static final CompanyCodeD companyCodeD = Singleton.getInstance(CompanyCodeD.class);
		public static final ServiceCode serviceCode = Singleton.getInstance(ServiceCode.class);
		public static final Valid valid = Singleton.getInstance(Valid.class);
		public static final Commentary commentary = Singleton.getInstance(Commentary.class);
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);

		public static class RegisterTypeD extends COBISInputValue {
			public RegisterTypeD() {
				this.init("VA_TEXTINPUTBOXEZS_466186","TipoRegistro");
			}
		}			

		public static class SupplyNumberD extends COBISInputValue {
			public SupplyNumberD() {
				this.init("VA_TEXTINPUTBOXBZL_809186","NumeroSuministro");
			}
		}			

		public static class PaymentDateD extends COBISDateTimePicker {
			public PaymentDateD() {
				this.init("VA_DATEFIELDJDJLSR_497186","FechaPago");
			}
		}			

		public static class TerminalIdD extends COBISInputValue {
			public TerminalIdD() {
				this.init("VA_TEXTINPUTBOXACK_901186","Terminal");
			}
		}			

		public static class ConvertedAmountDebtD extends COBISInputValue {
			public ConvertedAmountDebtD() {
				this.init("VA_TEXTINPUTBOXUEW_526186","MontoDeuda");
			}
		}			

		public static class ConvertedComissionD extends COBISInputValue {
			public ConvertedComissionD() {
				this.init("VA_TEXTINPUTBOXMLJ_824186","ComisionConvertido");
			}
		}			

		public static class ConvertedConcept extends COBISInputValue {
			public ConvertedConcept() {
				this.init("VA_TEXTINPUTBOXBBF_300186","TotalAdicionales");
			}
		}			

		public static class ConvertedTotalAmountD extends COBISInputValue {
			public ConvertedTotalAmountD() {
				this.init("VA_TEXTINPUTBOXJFI_797186","ImporteTotal");
			}
		}			

		public static class TransactionNumverD extends COBISInputValue {
			public TransactionNumverD() {
				this.init("VA_TEXTINPUTBOXLAN_603186","NumeroTransaccion");
			}
		}			

		public static class OperationNumberD extends COBISInputValue {
			public OperationNumberD() {
				this.init("VA_TEXTINPUTBOXVUD_897186","NumOperacion");
			}
		}			

		public static class BillNumberD extends COBISInputValue {
			public BillNumberD() {
				this.init("VA_TEXTINPUTBOXNDT_577186","NumeroFactura");
			}
		}			

		public static class CompanyCodeD extends COBISInputValue {
			public CompanyCodeD() {
				this.init("VA_TEXTINPUTBOXRDT_503186","CodigoEmpresa");
			}
		}			

		public static class ServiceCode extends COBISInputValue {
			public ServiceCode() {
				this.init("VA_TEXTINPUTBOXXXU_485186","CodigoServicio");
			}
		}			

		public static class Valid extends COBISInputValue {
			public Valid() {
				this.init("VA_TEXTINPUTBOXDPK_643186","Valido");
			}
		}			

		public static class Commentary extends COBISInputValue {
			public Commentary() {
				this.init("VA_TEXTINPUTBOXINM_152186","Comentario");
			}
		}			

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_TEXTINPUTBOXPFK_513186","Sequential");
			}
		}			
	}
	
	public static class GridPaymentConciliationHeader extends COBISGrid {
		public GridPaymentConciliationHeader() {
			this.init("QV_JO45_POJ74", "QV_JO45_POJ74");
		} 

		public static final RegisterTypeC registerTypeC = Singleton.getInstance(RegisterTypeC.class);
		public static final ChannelCodeC channelCodeC = Singleton.getInstance(ChannelCodeC.class);
		public static final ProcessDateC processDateC = Singleton.getInstance(ProcessDateC.class);
		public static final RowsNumber rowsNumber = Singleton.getInstance(RowsNumber.class);
		public static final TotalConvertedDebtC totalConvertedDebtC = Singleton.getInstance(TotalConvertedDebtC.class);
		public static final TotalConvertedComissionC totalConvertedComissionC = Singleton.getInstance(TotalConvertedComissionC.class);
		public static final TotalConvertedConceptC totalConvertedConceptC = Singleton.getInstance(TotalConvertedConceptC.class);
		public static final TotalConvertedAmountC totalConvertedAmountC = Singleton.getInstance(TotalConvertedAmountC.class);
		public static final ConciliationType conciliationType = Singleton.getInstance(ConciliationType.class);
		public static final Blanks blanks = Singleton.getInstance(Blanks.class);
		public static final Header header = Singleton.getInstance(Header.class);
		public static final Valid valid = Singleton.getInstance(Valid.class);
		public static final Commentary commentary = Singleton.getInstance(Commentary.class);
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);

		public static class RegisterTypeC extends COBISInputValue {
			public RegisterTypeC() {
				this.init("VA_TEXTINPUTBOXGUK_316186","TipoRegistro");
			}
		}			

		public static class ChannelCodeC extends COBISInputValue {
			public ChannelCodeC() {
				this.init("VA_TEXTINPUTBOXUYM_329186","CodigoCanal");
			}
		}			

		public static class ProcessDateC extends COBISDatePicker {
			public ProcessDateC() {
				this.init("VA_DATEFIELDQHVBOU_200186","FechaProceso");
			}
		}			

		public static class RowsNumber extends COBISInputValue {
			public RowsNumber() {
				this.init("VA_TEXTINPUTBOXZSB_956186","CantidadRegistros");
			}
		}			

		public static class TotalConvertedDebtC extends COBISInputValue {
			public TotalConvertedDebtC() {
				this.init("VA_TEXTINPUTBOXGIV_659186","TotalDeuda");
			}
		}			

		public static class TotalConvertedComissionC extends COBISInputValue {
			public TotalConvertedComissionC() {
				this.init("VA_TEXTINPUTBOXHTX_516186","TotalComision");
			}
		}			

		public static class TotalConvertedConceptC extends COBISInputValue {
			public TotalConvertedConceptC() {
				this.init("VA_TEXTINPUTBOXRDF_184186","TotalAdicionales");
			}
		}			

		public static class TotalConvertedAmountC extends COBISInputValue {
			public TotalConvertedAmountC() {
				this.init("VA_TEXTINPUTBOXNHQ_623186","TotalMontos");
			}
		}			

		public static class ConciliationType extends COBISInputValue {
			public ConciliationType() {
				this.init("VA_TEXTINPUTBOXUEE_713186","TipoConciliacion");
			}
		}			

		public static class Blanks extends COBISInputValue {
			public Blanks() {
				this.init("VA_TEXTINPUTBOXPYO_635186","Blancos");
			}
		}			

		public static class Header extends COBISInputValue {
			public Header() {
				this.init("VA_TEXTINPUTBOXERD_115186","Header");
			}
		}			

		public static class Valid extends COBISInputValue {
			public Valid() {
				this.init("VA_TEXTINPUTBOXCVH_697186","Valido");
			}
		}			

		public static class Commentary extends COBISInputValue {
			public Commentary() {
				this.init("VA_TEXTINPUTBOXPHG_151186","Comentario");
			}
		}			

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_TEXTINPUTBOXZPY_728186","Sequential");
			}
		}			
	}
}
