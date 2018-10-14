package lista1ex1;

public class RadioRelogio implements Radio, Relogio {
  private String emissora;
  private String emissoraTipo;
  private int volumeRadio;
  private int horario;
  private int horarioAlarme;
  private int volumeRelogio;
  private boolean alarmeLigado;

  public void setEmissora(String emissora, String emissoraTipo) {
    this.emissora = emissora;
    this.emissoraTipo = emissoraTipo;
  }

  public void setVolumeRadio(int volume) {
    this.volumeRadio = volume;
  }

  public void setHorario(int horario) {
    this.horario = horario;
  }

  public void setHorarioAlarme(int horario) {
    this.horarioAlarme = horario;
  }

  public void setVolumeRelogio(int volume) {
    this.volumeRelogio = volume;
  }

  public void ligaAlarme() {
    this.alarmeLigado = true;
  }

  public void desligaAlarme() {
    this.alarmeLigado = false;
  }

  public String getEmissora() {
    return this.emissora;
  }

  public String getEmissoraTipo() {
    return this.emissoraTipo;
  }

  public int getVolumeRadio() {
    return this.volumeRadio;
  }

  public int getHorario() {
    return this.horario;
  }

  public int getHorarioAlarme() {
    return this.horarioAlarme;
  }

  public int getVolumeRelogio() {
    return this.volumeRelogio;
  }
}
