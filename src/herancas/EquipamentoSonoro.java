package herancas;

public class EquipamentoSonoro extends Equipamento {
	private Integer volume;
	private Boolean stereo;
	
	
	
	

	public EquipamentoSonoro(Boolean ligado, Integer volume, Boolean stereo) {
		super(ligado);
		this.volume = volume;
		this.stereo = stereo;
	}

	
	
	public Integer getVolume() {
		return volume;
	}



	public void setVolume(Integer volume) {
		this.volume = volume;
	}



	public Boolean getStereo() {
		return stereo;
	}



	public void setStereo(Boolean stereo) {
		this.stereo = stereo;
	}



	public void mono() {
		this.stereo = false;
	}
	
	public void stereo() {
		this.stereo = true;
	}
	
	@Override
	public void liga() {
		this.volume = 5;
	}
	
}
