public class Incidente {
  protected int id;
  protected Datetime fecha_reportado;
  protected String estado;
  protected String titulo;
  protected String description;
  protected List<Object> log_actualizaciones;
  protected Datetime fecha_cerrado;
  protected String tipo;
  protected Usuario responsable;
  protected PersonalAcadémico beneficiario;
}
