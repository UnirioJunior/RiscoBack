package com.unirio.Meu.Projeto.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "form_risco_cirurgico")
public class FormRiscoCirurgicoEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_licenca", nullable = false)
    private LicencaEntities licenca;

    @ManyToOne
    @JoinColumn(name = "id_paciente", nullable = true)
    private PacienteEntities paciente;

    @Column(name = "cirurgia_data", nullable = true)
    private String dataCirurgia;

    @ManyToOne
    @JoinColumn(name = "id_procedimento", nullable = true)
    private ProcedimentoEntities procedimento;

    @ManyToOne
    @JoinColumn(name = "id_risco", nullable = true)
    private ProcedimentoRiscoEntities risco;

    @Column(nullable = true, columnDefinition = "text")
    private String annamnese;

    @Column(nullable = false, columnDefinition = "text")
    private String exameFisico;

    @Column(nullable = false, columnDefinition = "text")
    private String exameOutros;

    @Column(nullable = true, columnDefinition = "text")
    private String parecer;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = true)
    private UserEntities usuario;

    public FormRiscoCirurgicoEntities() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LicencaEntities getLicenca() {
        return licenca;
    }

    public void setLicenca(LicencaEntities licenca) {
        this.licenca = licenca;
    }

    public PacienteEntities getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteEntities paciente) {
        this.paciente = paciente;
    }

    public String getDataCirurgia() {
        return dataCirurgia;
    }

    public void setDataCirurgia(String dataCirurgia) {
        this.dataCirurgia = dataCirurgia;
    }

    public ProcedimentoEntities getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(ProcedimentoEntities procedimento) {
        this.procedimento = procedimento;
    }

    public ProcedimentoRiscoEntities getRisco() {
        return risco;
    }

    public void setRisco(ProcedimentoRiscoEntities risco) {
        this.risco = risco;
    }

    public String getAnamnese() {
        return annamnese;
    }

    public void setAnamnese(String annamnese) {
        this.annamnese = annamnese;
    }

    public String getExameFisico() {
        return exameFisico;
    }

    public void setExameFisico(String exameFisico) {
        this.exameFisico = exameFisico;
    }

    public String getExameOutros() {
        return exameOutros;
    }

    public void setExameOutros(String exameOutros) {
        this.exameOutros = exameOutros;
    }

    public String getParecer() {
        return parecer;
    }

    public void setParecer(String parecer) {
        this.parecer = parecer;
    }

//    public ExamesLaboratoriaisEntities getExamesLaboratoriais() {
//        return examesLaboratoriais;
//    }
//
//    public void setExamesLaboratoriais(ExamesLaboratoriaisEntities examesLaboratoriais) {
//        this.examesLaboratoriais = examesLaboratoriais;
//    }

    public UserEntities getUsuario() {
        return usuario;
    }

    public void setUsuario(UserEntities usuario) {
        this.usuario = usuario;
    }

	public String getAnnamnese() {
		return annamnese;
	}

	public void setAnnamnese(String annamnese) {
		this.annamnese = annamnese;
	}
    
}


