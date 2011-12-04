/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mvcmetamodel.MvcmetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MvcmetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mvcmetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mvcmetamodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mvcmetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MvcmetamodelPackage eINSTANCE = mvcmetamodel.impl.MvcmetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.ServletMappingImpl <em>Servlet Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.ServletMappingImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getServletMapping()
	 * @generated
	 */
	int SERVLET_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING__URL_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Servlet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING__SERVLET = 2;

	/**
	 * The number of structural features of the '<em>Servlet Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.ServletImpl <em>Servlet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.ServletImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getServlet()
	 * @generated
	 */
	int SERVLET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET__CONTAINS = 2;

	/**
	 * The feature id for the '<em><b>Load On Startup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET__LOAD_ON_STARTUP = 3;

	/**
	 * The feature id for the '<em><b>Init Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET__INIT_PARAM = 4;

	/**
	 * The number of structural features of the '<em>Servlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVLET_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.FormImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Button Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__BUTTON_FORM = 4;

	/**
	 * The feature id for the '<em><b>Servlet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SERVLET = 5;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.PageImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 3;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 4;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__COMPONENT = 5;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.ComponentImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 14;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.LabelImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__VALUE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.TextFieldImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__TEXT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.InitParamImpl <em>Init Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.InitParamImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getInitParam()
	 * @generated
	 */
	int INIT_PARAM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PARAM__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Init Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.ApplicationImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 7;

	/**
	 * The feature id for the '<em><b>Webxml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__WEBXML = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PAGE = 3;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.WebXMLImpl <em>Web XML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.WebXMLImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getWebXML()
	 * @generated
	 */
	int WEB_XML = 8;

	/**
	 * The feature id for the '<em><b>Servlet Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_XML__SERVLET_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_XML__RESOURCE_REF = 1;

	/**
	 * The feature id for the '<em><b>Servlet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_XML__SERVLET = 2;

	/**
	 * The feature id for the '<em><b>Welcome File List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_XML__WELCOME_FILE_LIST = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_XML__NAME = 4;

	/**
	 * The number of structural features of the '<em>Web XML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_XML_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.ResourceRefImpl <em>Resource Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.ResourceRefImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getResourceRef()
	 * @generated
	 */
	int RESOURCE_REF = 9;

	/**
	 * The feature id for the '<em><b>Res Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__RES_REF_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Res Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__RES_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Res Auth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__RES_AUTH = 3;

	/**
	 * The number of structural features of the '<em>Resource Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.WelcomeFileListImpl <em>Welcome File List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.WelcomeFileListImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getWelcomeFileList()
	 * @generated
	 */
	int WELCOME_FILE_LIST = 10;

	/**
	 * The feature id for the '<em><b>Welcome File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE_LIST__WELCOME_FILE = 0;

	/**
	 * The number of structural features of the '<em>Welcome File List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.WelcomeFileImpl <em>Welcome File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.WelcomeFileImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getWelcomeFile()
	 * @generated
	 */
	int WELCOME_FILE = 11;

	/**
	 * The feature id for the '<em><b>Page Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE__PAGE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Welcome File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_FILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.TableImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 12;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.LinkImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 13;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.InputImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.ResourcesImpl <em>Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.ResourcesImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getResources()
	 * @generated
	 */
	int RESOURCES = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.JavaImpl <em>Java</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.JavaImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getJava()
	 * @generated
	 */
	int JAVA = 17;

	/**
	 * The number of structural features of the '<em>Java</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mvcmetamodel.ServletMapping <em>Servlet Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet Mapping</em>'.
	 * @see mvcmetamodel.ServletMapping
	 * @generated
	 */
	EClass getServletMapping();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.ServletMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvcmetamodel.ServletMapping#getName()
	 * @see #getServletMapping()
	 * @generated
	 */
	EAttribute getServletMapping_Name();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.ServletMapping#getUrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Pattern</em>'.
	 * @see mvcmetamodel.ServletMapping#getUrlPattern()
	 * @see #getServletMapping()
	 * @generated
	 */
	EAttribute getServletMapping_UrlPattern();

	/**
	 * Returns the meta object for the reference '{@link mvcmetamodel.ServletMapping#getServlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servlet</em>'.
	 * @see mvcmetamodel.ServletMapping#getServlet()
	 * @see #getServletMapping()
	 * @generated
	 */
	EReference getServletMapping_Servlet();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Servlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet</em>'.
	 * @see mvcmetamodel.Servlet
	 * @generated
	 */
	EClass getServlet();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Servlet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvcmetamodel.Servlet#getName()
	 * @see #getServlet()
	 * @generated
	 */
	EAttribute getServlet_Name();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Servlet#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see mvcmetamodel.Servlet#getClass_()
	 * @see #getServlet()
	 * @generated
	 */
	EAttribute getServlet_Class();

	/**
	 * Returns the meta object for the containment reference '{@link mvcmetamodel.Servlet#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains</em>'.
	 * @see mvcmetamodel.Servlet#getContains()
	 * @see #getServlet()
	 * @generated
	 */
	EReference getServlet_Contains();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Servlet#getLoadOnStartup <em>Load On Startup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load On Startup</em>'.
	 * @see mvcmetamodel.Servlet#getLoadOnStartup()
	 * @see #getServlet()
	 * @generated
	 */
	EAttribute getServlet_LoadOnStartup();

	/**
	 * Returns the meta object for the containment reference '{@link mvcmetamodel.Servlet#getInitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Param</em>'.
	 * @see mvcmetamodel.Servlet#getInitParam()
	 * @see #getServlet()
	 * @generated
	 */
	EReference getServlet_InitParam();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see mvcmetamodel.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Form#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvcmetamodel.Form#getName()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Name();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Form#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see mvcmetamodel.Form#getMethod()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Method();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Form#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see mvcmetamodel.Form#getAction()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Form#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see mvcmetamodel.Form#getComponent()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Component();

	/**
	 * Returns the meta object for the containment reference '{@link mvcmetamodel.Form#getButtonForm <em>Button Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Button Form</em>'.
	 * @see mvcmetamodel.Form#getButtonForm()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_ButtonForm();

	/**
	 * Returns the meta object for the reference '{@link mvcmetamodel.Form#getServlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servlet</em>'.
	 * @see mvcmetamodel.Form#getServlet()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Servlet();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see mvcmetamodel.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Page#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see mvcmetamodel.Page#getContains()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Page#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see mvcmetamodel.Page#getComponents()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Components();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvcmetamodel.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Page#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mvcmetamodel.Page#getType()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Type();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see mvcmetamodel.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Page#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see mvcmetamodel.Page#getComponent()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Component();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see mvcmetamodel.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Label#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mvcmetamodel.Label#getValue()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Value();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see mvcmetamodel.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.TextField#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see mvcmetamodel.TextField#getText()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Text();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.InitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Param</em>'.
	 * @see mvcmetamodel.InitParam
	 * @generated
	 */
	EClass getInitParam();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.InitParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvcmetamodel.InitParam#getName()
	 * @see #getInitParam()
	 * @generated
	 */
	EAttribute getInitParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.InitParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mvcmetamodel.InitParam#getValue()
	 * @see #getInitParam()
	 * @generated
	 */
	EAttribute getInitParam_Value();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see mvcmetamodel.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Application#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see mvcmetamodel.Application#getPage()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Page();

	/**
	 * Returns the meta object for the containment reference '{@link mvcmetamodel.Application#getWebxml <em>Webxml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Webxml</em>'.
	 * @see mvcmetamodel.Application#getWebxml()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Webxml();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Application#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see mvcmetamodel.Application#getResources()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Resources();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvcmetamodel.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.WebXML <em>Web XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web XML</em>'.
	 * @see mvcmetamodel.WebXML
	 * @generated
	 */
	EClass getWebXML();

	/**
	 * Returns the meta object for the containment reference '{@link mvcmetamodel.WebXML#getServletMapping <em>Servlet Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet Mapping</em>'.
	 * @see mvcmetamodel.WebXML#getServletMapping()
	 * @see #getWebXML()
	 * @generated
	 */
	EReference getWebXML_ServletMapping();

	/**
	 * Returns the meta object for the containment reference '{@link mvcmetamodel.WebXML#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Ref</em>'.
	 * @see mvcmetamodel.WebXML#getResourceRef()
	 * @see #getWebXML()
	 * @generated
	 */
	EReference getWebXML_ResourceRef();

	/**
	 * Returns the meta object for the containment reference '{@link mvcmetamodel.WebXML#getServlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servlet</em>'.
	 * @see mvcmetamodel.WebXML#getServlet()
	 * @see #getWebXML()
	 * @generated
	 */
	EReference getWebXML_Servlet();

	/**
	 * Returns the meta object for the containment reference '{@link mvcmetamodel.WebXML#getWelcomeFileList <em>Welcome File List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Welcome File List</em>'.
	 * @see mvcmetamodel.WebXML#getWelcomeFileList()
	 * @see #getWebXML()
	 * @generated
	 */
	EReference getWebXML_WelcomeFileList();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.WebXML#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvcmetamodel.WebXML#getName()
	 * @see #getWebXML()
	 * @generated
	 */
	EAttribute getWebXML_Name();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.ResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Ref</em>'.
	 * @see mvcmetamodel.ResourceRef
	 * @generated
	 */
	EClass getResourceRef();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.ResourceRef#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Ref Name</em>'.
	 * @see mvcmetamodel.ResourceRef#getResRefName()
	 * @see #getResourceRef()
	 * @generated
	 */
	EAttribute getResourceRef_ResRefName();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.ResourceRef#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mvcmetamodel.ResourceRef#getDescription()
	 * @see #getResourceRef()
	 * @generated
	 */
	EAttribute getResourceRef_Description();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.ResourceRef#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Type</em>'.
	 * @see mvcmetamodel.ResourceRef#getResType()
	 * @see #getResourceRef()
	 * @generated
	 */
	EAttribute getResourceRef_ResType();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.ResourceRef#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Auth</em>'.
	 * @see mvcmetamodel.ResourceRef#getResAuth()
	 * @see #getResourceRef()
	 * @generated
	 */
	EAttribute getResourceRef_ResAuth();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.WelcomeFileList <em>Welcome File List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Welcome File List</em>'.
	 * @see mvcmetamodel.WelcomeFileList
	 * @generated
	 */
	EClass getWelcomeFileList();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.WelcomeFileList#getWelcomeFile <em>Welcome File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Welcome File</em>'.
	 * @see mvcmetamodel.WelcomeFileList#getWelcomeFile()
	 * @see #getWelcomeFileList()
	 * @generated
	 */
	EReference getWelcomeFileList_WelcomeFile();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.WelcomeFile <em>Welcome File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Welcome File</em>'.
	 * @see mvcmetamodel.WelcomeFile
	 * @generated
	 */
	EClass getWelcomeFile();

	/**
	 * Returns the meta object for the reference '{@link mvcmetamodel.WelcomeFile#getPageName <em>Page Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page Name</em>'.
	 * @see mvcmetamodel.WelcomeFile#getPageName()
	 * @see #getWelcomeFile()
	 * @generated
	 */
	EReference getWelcomeFile_PageName();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see mvcmetamodel.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see mvcmetamodel.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Link#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see mvcmetamodel.Link#getUrl()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Url();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Link#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see mvcmetamodel.Link#getText()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Text();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see mvcmetamodel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see mvcmetamodel.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mvcmetamodel.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvcmetamodel.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Input#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mvcmetamodel.Input#getValue()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Value();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources</em>'.
	 * @see mvcmetamodel.Resources
	 * @generated
	 */
	EClass getResources();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Resources#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvcmetamodel.Resources#getName()
	 * @see #getResources()
	 * @generated
	 */
	EAttribute getResources_Name();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Java <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java</em>'.
	 * @see mvcmetamodel.Java
	 * @generated
	 */
	EClass getJava();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MvcmetamodelFactory getMvcmetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.ServletMappingImpl <em>Servlet Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.ServletMappingImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getServletMapping()
		 * @generated
		 */
		EClass SERVLET_MAPPING = eINSTANCE.getServletMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET_MAPPING__NAME = eINSTANCE.getServletMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Url Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET_MAPPING__URL_PATTERN = eINSTANCE.getServletMapping_UrlPattern();

		/**
		 * The meta object literal for the '<em><b>Servlet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET_MAPPING__SERVLET = eINSTANCE.getServletMapping_Servlet();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.ServletImpl <em>Servlet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.ServletImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getServlet()
		 * @generated
		 */
		EClass SERVLET = eINSTANCE.getServlet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET__NAME = eINSTANCE.getServlet_Name();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET__CLASS = eINSTANCE.getServlet_Class();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET__CONTAINS = eINSTANCE.getServlet_Contains();

		/**
		 * The meta object literal for the '<em><b>Load On Startup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET__LOAD_ON_STARTUP = eINSTANCE.getServlet_LoadOnStartup();

		/**
		 * The meta object literal for the '<em><b>Init Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVLET__INIT_PARAM = eINSTANCE.getServlet_InitParam();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.FormImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__NAME = eINSTANCE.getForm_Name();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__METHOD = eINSTANCE.getForm_Method();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__ACTION = eINSTANCE.getForm_Action();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__COMPONENT = eINSTANCE.getForm_Component();

		/**
		 * The meta object literal for the '<em><b>Button Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__BUTTON_FORM = eINSTANCE.getForm_ButtonForm();

		/**
		 * The meta object literal for the '<em><b>Servlet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__SERVLET = eINSTANCE.getForm_Servlet();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.PageImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CONTAINS = eINSTANCE.getPage_Contains();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__COMPONENTS = eINSTANCE.getPage_Components();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TYPE = eINSTANCE.getPage_Type();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__COMPONENT = eINSTANCE.getPage_Component();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.LabelImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__VALUE = eINSTANCE.getLabel_Value();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.TextFieldImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__TEXT = eINSTANCE.getTextField_Text();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.InitParamImpl <em>Init Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.InitParamImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getInitParam()
		 * @generated
		 */
		EClass INIT_PARAM = eINSTANCE.getInitParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_PARAM__NAME = eINSTANCE.getInitParam_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_PARAM__VALUE = eINSTANCE.getInitParam_Value();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.ApplicationImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PAGE = eINSTANCE.getApplication_Page();

		/**
		 * The meta object literal for the '<em><b>Webxml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__WEBXML = eINSTANCE.getApplication_Webxml();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__RESOURCES = eINSTANCE.getApplication_Resources();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.WebXMLImpl <em>Web XML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.WebXMLImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getWebXML()
		 * @generated
		 */
		EClass WEB_XML = eINSTANCE.getWebXML();

		/**
		 * The meta object literal for the '<em><b>Servlet Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_XML__SERVLET_MAPPING = eINSTANCE.getWebXML_ServletMapping();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_XML__RESOURCE_REF = eINSTANCE.getWebXML_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Servlet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_XML__SERVLET = eINSTANCE.getWebXML_Servlet();

		/**
		 * The meta object literal for the '<em><b>Welcome File List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_XML__WELCOME_FILE_LIST = eINSTANCE.getWebXML_WelcomeFileList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_XML__NAME = eINSTANCE.getWebXML_Name();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.ResourceRefImpl <em>Resource Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.ResourceRefImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getResourceRef()
		 * @generated
		 */
		EClass RESOURCE_REF = eINSTANCE.getResourceRef();

		/**
		 * The meta object literal for the '<em><b>Res Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF__RES_REF_NAME = eINSTANCE.getResourceRef_ResRefName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF__DESCRIPTION = eINSTANCE.getResourceRef_Description();

		/**
		 * The meta object literal for the '<em><b>Res Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF__RES_TYPE = eINSTANCE.getResourceRef_ResType();

		/**
		 * The meta object literal for the '<em><b>Res Auth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF__RES_AUTH = eINSTANCE.getResourceRef_ResAuth();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.WelcomeFileListImpl <em>Welcome File List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.WelcomeFileListImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getWelcomeFileList()
		 * @generated
		 */
		EClass WELCOME_FILE_LIST = eINSTANCE.getWelcomeFileList();

		/**
		 * The meta object literal for the '<em><b>Welcome File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WELCOME_FILE_LIST__WELCOME_FILE = eINSTANCE.getWelcomeFileList_WelcomeFile();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.WelcomeFileImpl <em>Welcome File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.WelcomeFileImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getWelcomeFile()
		 * @generated
		 */
		EClass WELCOME_FILE = eINSTANCE.getWelcomeFile();

		/**
		 * The meta object literal for the '<em><b>Page Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WELCOME_FILE__PAGE_NAME = eINSTANCE.getWelcomeFile_PageName();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.TableImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.LinkImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__URL = eINSTANCE.getLink_Url();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TEXT = eINSTANCE.getLink_Text();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.ComponentImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.InputImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__VALUE = eINSTANCE.getInput_Value();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.ResourcesImpl <em>Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.ResourcesImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getResources()
		 * @generated
		 */
		EClass RESOURCES = eINSTANCE.getResources();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES__NAME = eINSTANCE.getResources_Name();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.JavaImpl <em>Java</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.JavaImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getJava()
		 * @generated
		 */
		EClass JAVA = eINSTANCE.getJava();

	}

} //MvcmetamodelPackage
