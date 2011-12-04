/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import mvcmetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MvcmetamodelFactoryImpl extends EFactoryImpl implements MvcmetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MvcmetamodelFactory init() {
		try {
			MvcmetamodelFactory theMvcmetamodelFactory = (MvcmetamodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://mvcmetamodel/1.0"); 
			if (theMvcmetamodelFactory != null) {
				return theMvcmetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MvcmetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MvcmetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MvcmetamodelPackage.SERVLET_MAPPING: return createServletMapping();
			case MvcmetamodelPackage.SERVLET: return createServlet();
			case MvcmetamodelPackage.FORM: return createForm();
			case MvcmetamodelPackage.PAGE: return createPage();
			case MvcmetamodelPackage.LABEL: return createLabel();
			case MvcmetamodelPackage.TEXT_FIELD: return createTextField();
			case MvcmetamodelPackage.INIT_PARAM: return createInitParam();
			case MvcmetamodelPackage.APPLICATION: return createApplication();
			case MvcmetamodelPackage.WEB_XML: return createWebXML();
			case MvcmetamodelPackage.RESOURCE_REF: return createResourceRef();
			case MvcmetamodelPackage.WELCOME_FILE_LIST: return createWelcomeFileList();
			case MvcmetamodelPackage.WELCOME_FILE: return createWelcomeFile();
			case MvcmetamodelPackage.TABLE: return createTable();
			case MvcmetamodelPackage.LINK: return createLink();
			case MvcmetamodelPackage.COMPONENT: return createComponent();
			case MvcmetamodelPackage.INPUT: return createInput();
			case MvcmetamodelPackage.RESOURCES: return createResources();
			case MvcmetamodelPackage.JAVA: return createJava();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletMapping createServletMapping() {
		ServletMappingImpl servletMapping = new ServletMappingImpl();
		return servletMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servlet createServlet() {
		ServletImpl servlet = new ServletImpl();
		return servlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextField createTextField() {
		TextFieldImpl textField = new TextFieldImpl();
		return textField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitParam createInitParam() {
		InitParamImpl initParam = new InitParamImpl();
		return initParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebXML createWebXML() {
		WebXMLImpl webXML = new WebXMLImpl();
		return webXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRef createResourceRef() {
		ResourceRefImpl resourceRef = new ResourceRefImpl();
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WelcomeFileList createWelcomeFileList() {
		WelcomeFileListImpl welcomeFileList = new WelcomeFileListImpl();
		return welcomeFileList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WelcomeFile createWelcomeFile() {
		WelcomeFileImpl welcomeFile = new WelcomeFileImpl();
		return welcomeFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resources createResources() {
		ResourcesImpl resources = new ResourcesImpl();
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java createJava() {
		JavaImpl java = new JavaImpl();
		return java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MvcmetamodelPackage getMvcmetamodelPackage() {
		return (MvcmetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static MvcmetamodelPackage getPackage() {
		return MvcmetamodelPackage.eINSTANCE;
	}

} //MvcmetamodelFactoryImpl
