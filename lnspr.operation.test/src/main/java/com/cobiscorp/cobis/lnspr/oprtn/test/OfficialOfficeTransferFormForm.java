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

public class OfficialOfficeTransferFormForm{
	public static final OfficialOfficeTransferFilter officialOfficeTransferFilter = Singleton.getInstance(OfficialOfficeTransferFilter.class);

	public static final GridOfficialOfficeTransferList gridOfficialOfficeTransferList = Singleton.getInstance(GridOfficialOfficeTransferList.class);
	private OfficialOfficeTransferFormForm() {
		throw new IllegalStateException("OfficialOfficeTransferFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTLNSPRXNW2R cmdCommand1IdCMTLNSPRXNW2R = Singleton.getInstance(CmdCommand1IdCMTLNSPRXNW2R.class);
		
		public static class CmdCommand1IdCMTLNSPRXNW2R extends COBISButton{
			public CmdCommand1IdCMTLNSPRXNW2R () {
				this.init("CM_TLNSPRXN_W2R", "Trasladar");
			}
		}
	
		public static final BtnVAVABUTTONJPBQXMZ513800IdVAVABUTTONJPBQXMZ513800 btnVAVABUTTONJPBQXMZ513800IdVAVABUTTONJPBQXMZ513800 = Singleton.getInstance(BtnVAVABUTTONJPBQXMZ513800IdVAVABUTTONJPBQXMZ513800.class);
		
		public static class BtnVAVABUTTONJPBQXMZ513800IdVAVABUTTONJPBQXMZ513800 extends COBISButton{
			public BtnVAVABUTTONJPBQXMZ513800IdVAVABUTTONJPBQXMZ513800 () {
				this.init("VA_VABUTTONJPBQXMZ_513800", "Buscar");
			}
		}
	

	}
	

	public static class OfficialOfficeTransferFilter {
	
		private OfficialOfficeTransferFilter() {
			throw new IllegalStateException("OfficialOfficeTransferFormForm is a utility class");
		}
		
		public static final TransferType transferType = Singleton.getInstance(TransferType.class);
		public static final OriginOffice originOffice = Singleton.getInstance(OriginOffice.class);
		public static final OriginOfficial originOfficial = Singleton.getInstance(OriginOfficial.class);
		public static final DestinationOffice destinationOffice = Singleton.getInstance(DestinationOffice.class);
		public static final DestinationOfficial destinationOfficial = Singleton.getInstance(DestinationOfficial.class);
		public static final Reason reason = Singleton.getInstance(Reason.class);

		public static class TransferType extends COBISRadioButtonList {
			public TransferType() {
				this.init("VA_TRANSFERTYPETWU_989800","Seleccione");
			}
		}			

		public static class OriginOffice extends COBISDropDownList {
			public OriginOffice() {
				this.init("VA_ORIGINOFFICEUMK_654800","Oficina");
			}
		}			

		public static class OriginOfficial extends COBISDropDownList {
			public OriginOfficial() {
				this.init("VA_ORIGINOFFICILAA_229800","Oficial");
			}
		}			

		public static class DestinationOffice extends COBISDropDownList {
			public DestinationOffice() {
				this.init("VA_DESTINATIONOEEF_643800","Oficina");
			}
		}			

		public static class DestinationOfficial extends COBISDropDownList {
			public DestinationOfficial() {
				this.init("VA_DESTINATIONOIAI_845800","Oficial");
			}
		}			

		public static class Reason extends COBISDropDownList {
			public Reason() {
				this.init("VA_REASONDDWAKVIHS_847800","Motivo");
			}
		}			
	}
	
	public static class GridOfficialOfficeTransferList extends COBISGrid {
		public GridOfficialOfficeTransferList() {
			this.init("QV_JQ56_BYK87", "QV_JQ56_BYK87");
		} 

	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons Grid is a utility class");
		}



		public static final BtnGridCommandIdCEQV201QVJQ56BYK87540 btnGridCommandIdCEQV201QVJQ56BYK87540 = Singleton.getInstance(BtnGridCommandIdCEQV201QVJQ56BYK87540.class);

		public static class BtnGridCommandIdCEQV201QVJQ56BYK87540 extends COBISButton {
			public BtnGridCommandIdCEQV201QVJQ56BYK87540() {
				this.init("CEQV_201QV_JQ56_BYK87_540","Seleccionar");
			}
		}
	}
		public static final Selected selected = Singleton.getInstance(Selected.class);
		public static final LoanType loanType = Singleton.getInstance(LoanType.class);
		public static final BankId bankId = Singleton.getInstance(BankId.class);
		public static final LoanStatus loanStatus = Singleton.getInstance(LoanStatus.class);
		public static final LoansStatusDesc loansStatusDesc = Singleton.getInstance(LoansStatusDesc.class);
		public static final ClientCode clientCode = Singleton.getInstance(ClientCode.class);
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final Category category = Singleton.getInstance(Category.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final ExpirationDate expirationDate = Singleton.getInstance(ExpirationDate.class);
		public static final CurrencyCode currencyCode = Singleton.getInstance(CurrencyCode.class);
		public static final DisbursementDate disbursementDate = Singleton.getInstance(DisbursementDate.class);
		public static final ProcessNumber processNumber = Singleton.getInstance(ProcessNumber.class);
		public static final GroupCode groupCode = Singleton.getInstance(GroupCode.class);
		public static final OfficeCode officeCode = Singleton.getInstance(OfficeCode.class);
		public static final OfficialCode officialCode = Singleton.getInstance(OfficialCode.class);
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);

		public static class Selected extends COBISCheckBox {
			public Selected() {
				this.init("VA_CHECKBOXGIYYTMJ_813800","Seleccionar");
			}
		}			

		public static class LoanType extends COBISInputValue {
			public LoanType() {
				this.init("VA_TEXTINPUTBOXZQP_407800","TipoPrestamo");
			}
		}			

		public static class BankId extends COBISInputValue {
			public BankId() {
				this.init("VA_TEXTINPUTBOXZGT_364800","NumPrestamo");
			}
		}			

		public static class LoanStatus extends COBISInputValue {
			public LoanStatus() {
				this.init("VA_TEXTINPUTBOXLNV_618800","Estado");
			}
		}			

		public static class LoansStatusDesc extends COBISInputValue {
			public LoansStatusDesc() {
				this.init("VA_TEXTINPUTBOXRQU_320800","EstadoPrestamo");
			}
		}			

		public static class ClientCode extends COBISInputValue {
			public ClientCode() {
				this.init("VA_TEXTINPUTBOXMYI_224800","CodCliente");
			}
		}			

		public static class ClientName extends COBISInputValue {
			public ClientName() {
				this.init("VA_TEXTINPUTBOXABA_156800","NombreCliente");
			}
		}			

		public static class Category extends COBISInputValue {
			public Category() {
				this.init("VA_TEXTINPUTBOXEAE_629800","Categoria");
			}
		}			

		public static class Amount extends COBISDropDownList {
			public Amount() {
				this.init("VA_TEXTINPUTBOXWUJ_217800","MontoPrestamo");
			}
		}			

		public static class ExpirationDate extends COBISDatePicker {
			public ExpirationDate() {
				this.init("VA_DATEFIELDCWGGHH_393800","ExpirationDate");
			}
		}			

		public static class CurrencyCode extends COBISInputValue {
			public CurrencyCode() {
				this.init("VA_TEXTINPUTBOXVFU_652800","Moneda");
			}
		}			

		public static class DisbursementDate extends COBISDatePicker {
			public DisbursementDate() {
				this.init("VA_DATEFIELDVJZAPD_814800","FechaDesembolso");
			}
		}			

		public static class ProcessNumber extends COBISInputValue {
			public ProcessNumber() {
				this.init("VA_TEXTINPUTBOXRPQ_938800","NumTramite");
			}
		}			

		public static class GroupCode extends COBISInputValue {
			public GroupCode() {
				this.init("VA_TEXTINPUTBOXQPF_381800","Grupo");
			}
		}			

		public static class OfficeCode extends COBISInputValue {
			public OfficeCode() {
				this.init("VA_TEXTINPUTBOXGMT_288800","Oficina");
			}
		}			

		public static class OfficialCode extends COBISInputValue {
			public OfficialCode() {
				this.init("VA_TEXTINPUTBOXPJJ_200800","Oficial");
			}
		}			

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_TEXTINPUTBOXBRO_849800","Sequential");
			}
		}			
	}
}
