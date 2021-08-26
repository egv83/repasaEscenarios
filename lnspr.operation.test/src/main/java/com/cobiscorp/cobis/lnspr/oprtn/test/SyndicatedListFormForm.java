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

public class SyndicatedListFormForm{
	public static final OperationEntity operationEntity = Singleton.getInstance(OperationEntity.class);

	private SyndicatedListFormForm() {
		throw new IllegalStateException("SyndicatedListFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTLNSPRSC7TC cmdCommand1IdCMTLNSPRSC7TC = Singleton.getInstance(CmdCommand1IdCMTLNSPRSC7TC.class);
		
		public static class CmdCommand1IdCMTLNSPRSC7TC extends COBISButton{
			public CmdCommand1IdCMTLNSPRSC7TC () {
				this.init("CM_TLNSPRSC_7TC", "Añadir");
			}
		}
	

	}
	

	public static class OperationEntity {
	
		private OperationEntity() {
			throw new IllegalStateException("SyndicatedListFormForm is a utility class");
		}
		
		public static final ParticipantS participantS = Singleton.getInstance(ParticipantS.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final TypeParticipants typeParticipants = Singleton.getInstance(TypeParticipants.class);
		public static final Mail mail = Singleton.getInstance(Mail.class);
		public static final AmountParticipants amountParticipants = Singleton.getInstance(AmountParticipants.class);
		public static final PercentageParticipants percentageParticipants = Singleton.getInstance(PercentageParticipants.class);

		public static class ParticipantS extends COBISInputTextButton {
			public ParticipantS() {
				this.init("VA_PARTICIPANTSTOP_981405","Participante");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_AMOUNTNHJBKJSFP_420405","MontoDisponible");
			}
		}			

		public static class TypeParticipants extends COBISRadioButtonList {
			public TypeParticipants() {
				this.init("VA_TYPEPARTICIPNNN_397405","Rol");
			}
		}			

		public static class Mail extends COBISInputValue {
			public Mail() {
				this.init("VA_MAILHXHVMKQUYBR_360405","Correo");
			}
		}			

		public static class AmountParticipants extends COBISInputValue {
			public AmountParticipants() {
				this.init("VA_AMOUNTPARTICTSP_895405","MontoParticipacion");
			}
		}			

		public static class PercentageParticipants extends COBISInputValue {
			public PercentageParticipants() {
				this.init("VA_PERCENTAGEPAISA_378405","PorcentajeParticipacion");
			}
		}			
	}
}
