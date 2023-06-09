import java.util.List;

public class Turma {
  private String cod;
  private Integer turno;
  private Integer sala;
  private List<Aluno> alunos;

  public String getCode() {
    return cod;
  }

  public void setCode(String cod) {
    this.cod = cod;
  }

  public Integer getTurno() {
    return turno;
  }

  public void setTurno(Integer turno) {
    this.turno = turno;
  }

  public Integer getSala() {
    return sala;
  }

  public void setSala(Integer sala) {
    this.sala = sala;
  }

  public List<Aluno> getAlunos() {
    return alunos;
  }

  public void setAlunos(List<Aluno> alunos) {
    this.alunos = alunos;
  }

}
