
package br.edu.unirn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.unirn package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Recuperar_QNAME = new QName("http://unirn.edu.br/", "recuperar");
    private final static QName _RecuperarResponse_QNAME = new QName("http://unirn.edu.br/", "recuperarResponse");
    private final static QName _Listar_QNAME = new QName("http://unirn.edu.br/", "listar");
    private final static QName _Work_QNAME = new QName("http://unirn.edu.br/", "work");
    private final static QName _ListarResponse_QNAME = new QName("http://unirn.edu.br/", "listarResponse");
    private final static QName _Cadastrar_QNAME = new QName("http://unirn.edu.br/", "cadastrar");
    private final static QName _CadastrarResponse_QNAME = new QName("http://unirn.edu.br/", "cadastrarResponse");
    private final static QName _WorkResponse_QNAME = new QName("http://unirn.edu.br/", "workResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.unirn
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Recuperar }
     * 
     */
    public Recuperar createRecuperar() {
        return new Recuperar();
    }

    /**
     * Create an instance of {@link RecuperarResponse }
     * 
     */
    public RecuperarResponse createRecuperarResponse() {
        return new RecuperarResponse();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link Work }
     * 
     */
    public Work createWork() {
        return new Work();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link Cadastrar }
     * 
     */
    public Cadastrar createCadastrar() {
        return new Cadastrar();
    }

    /**
     * Create an instance of {@link CadastrarResponse }
     * 
     */
    public CadastrarResponse createCadastrarResponse() {
        return new CadastrarResponse();
    }

    /**
     * Create an instance of {@link WorkResponse }
     * 
     */
    public WorkResponse createWorkResponse() {
        return new WorkResponse();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recuperar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unirn.edu.br/", name = "recuperar")
    public JAXBElement<Recuperar> createRecuperar(Recuperar value) {
        return new JAXBElement<Recuperar>(_Recuperar_QNAME, Recuperar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unirn.edu.br/", name = "recuperarResponse")
    public JAXBElement<RecuperarResponse> createRecuperarResponse(RecuperarResponse value) {
        return new JAXBElement<RecuperarResponse>(_RecuperarResponse_QNAME, RecuperarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unirn.edu.br/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Work }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unirn.edu.br/", name = "work")
    public JAXBElement<Work> createWork(Work value) {
        return new JAXBElement<Work>(_Work_QNAME, Work.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unirn.edu.br/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cadastrar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unirn.edu.br/", name = "cadastrar")
    public JAXBElement<Cadastrar> createCadastrar(Cadastrar value) {
        return new JAXBElement<Cadastrar>(_Cadastrar_QNAME, Cadastrar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unirn.edu.br/", name = "cadastrarResponse")
    public JAXBElement<CadastrarResponse> createCadastrarResponse(CadastrarResponse value) {
        return new JAXBElement<CadastrarResponse>(_CadastrarResponse_QNAME, CadastrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unirn.edu.br/", name = "workResponse")
    public JAXBElement<WorkResponse> createWorkResponse(WorkResponse value) {
        return new JAXBElement<WorkResponse>(_WorkResponse_QNAME, WorkResponse.class, null, value);
    }

}
