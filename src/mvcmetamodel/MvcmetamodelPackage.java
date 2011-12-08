/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link mvcmetamodel.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.FormImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 0;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.PageImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.ComponentImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 6;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.TextImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 2;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.WebAppImpl <em>Web App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.WebAppImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getWebApp()
	 * @generated
	 */
	int WEB_APP = 3;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.TableImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 4;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.LinkImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 5;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.InputImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 7;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.BodyImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 8;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.HeadImpl <em>Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.HeadImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getHead()
	 * @generated
	 */
	int HEAD = 9;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.TitleImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 10;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.TextFieldImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 11;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.PasswordImpl <em>Password</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.PasswordImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getPassword()
	 * @generated
	 */
	int PASSWORD = 12;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.RadioButtonImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 13;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.CheckBoxImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 14;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.SubmitButtonImpl <em>Submit Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.SubmitButtonImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getSubmitButton()
	 * @generated
	 */
	int SUBMIT_BUTTON = 15;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.ParagrapheImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getParagraphe()
	 * @generated
	 */
	int PARAGRAPHE = 16;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.CellImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 17;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.LineImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 18;

	/**
	 * The meta object id for the '{@link mvcmetamodel.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.impl.ContentImpl
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 19;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__METHOD = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ACTION = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__INPUTS = CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__COMPONENTS = CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TABLES = CONTENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__BODY = 2;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HEAD = 3;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENTS = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__COMPONENTS = COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__PAGES = 1;

	/**
	 * The feature id for the '<em><b>Start Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__START_PAGE = 2;

	/**
	 * The number of structural features of the '<em>Web App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LINES = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__COMPONENTS = COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CONTENTS = 0;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__COMPONENTS = COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__SIZE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__COMPONENTS = COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__SIZE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__MAX_LENGTH = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__COMPONENTS = COMPONENT__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Password</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__NAME = INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__VALUE = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__VALUE = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__NAME = INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__VALUE = INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Success Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__SUCCESS_TARGET = INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__ERROR_TARGET = INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Submit Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_FEATURE_COUNT = INPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__COMPONENTS = COMPONENT__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CELLS = 0;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mvcmetamodel.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.Size
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 20;

	/**
	 * The meta object id for the '{@link mvcmetamodel.Align <em>Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvcmetamodel.Align
	 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getAlign()
	 * @generated
	 */
	int ALIGN = 21;


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
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Form#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see mvcmetamodel.Form#getInputs()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Form#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see mvcmetamodel.Form#getComponents()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Form#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see mvcmetamodel.Form#getTables()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Tables();

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
	 * Returns the meta object for the containment reference '{@link mvcmetamodel.Page#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see mvcmetamodel.Page#getBody()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Body();

	/**
	 * Returns the meta object for the containment reference '{@link mvcmetamodel.Page#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see mvcmetamodel.Page#getHead()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Head();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see mvcmetamodel.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mvcmetamodel.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Value();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.WebApp <em>Web App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web App</em>'.
	 * @see mvcmetamodel.WebApp
	 * @generated
	 */
	EClass getWebApp();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.WebApp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvcmetamodel.WebApp#getName()
	 * @see #getWebApp()
	 * @generated
	 */
	EAttribute getWebApp_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.WebApp#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see mvcmetamodel.WebApp#getPages()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_Pages();

	/**
	 * Returns the meta object for the containment reference '{@link mvcmetamodel.WebApp#getStartPage <em>Start Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Page</em>'.
	 * @see mvcmetamodel.WebApp#getStartPage()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_StartPage();

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
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Table#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see mvcmetamodel.Table#getLines()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Lines();

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
	 * Returns the meta object for class '{@link mvcmetamodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see mvcmetamodel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Component#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see mvcmetamodel.Component#getComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Components();

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
	 * Returns the meta object for class '{@link mvcmetamodel.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see mvcmetamodel.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Body#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see mvcmetamodel.Body#getContents()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Contents();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head</em>'.
	 * @see mvcmetamodel.Head
	 * @generated
	 */
	EClass getHead();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Head#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see mvcmetamodel.Head#getTitle()
	 * @see #getHead()
	 * @generated
	 */
	EAttribute getHead_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Head#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see mvcmetamodel.Head#getComponents()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_Components();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see mvcmetamodel.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Title#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see mvcmetamodel.Title#getSize()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Size();

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
	 * Returns the meta object for the attribute '{@link mvcmetamodel.TextField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see mvcmetamodel.TextField#getSize()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Size();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.TextField#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see mvcmetamodel.TextField#getMaxLength()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_MaxLength();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Password <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password</em>'.
	 * @see mvcmetamodel.Password
	 * @generated
	 */
	EClass getPassword();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see mvcmetamodel.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.RadioButton#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mvcmetamodel.RadioButton#getValue()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Value();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see mvcmetamodel.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.CheckBox#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mvcmetamodel.CheckBox#getValue()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Value();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.SubmitButton <em>Submit Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submit Button</em>'.
	 * @see mvcmetamodel.SubmitButton
	 * @generated
	 */
	EClass getSubmitButton();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.SubmitButton#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mvcmetamodel.SubmitButton#getValue()
	 * @see #getSubmitButton()
	 * @generated
	 */
	EAttribute getSubmitButton_Value();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.SubmitButton#getSuccessTarget <em>Success Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Target</em>'.
	 * @see mvcmetamodel.SubmitButton#getSuccessTarget()
	 * @see #getSubmitButton()
	 * @generated
	 */
	EAttribute getSubmitButton_SuccessTarget();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.SubmitButton#getErrorTarget <em>Error Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Target</em>'.
	 * @see mvcmetamodel.SubmitButton#getErrorTarget()
	 * @see #getSubmitButton()
	 * @generated
	 */
	EAttribute getSubmitButton_ErrorTarget();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraphe</em>'.
	 * @see mvcmetamodel.Paragraphe
	 * @generated
	 */
	EClass getParagraphe();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see mvcmetamodel.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link mvcmetamodel.Cell#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see mvcmetamodel.Cell#getContent()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Cell#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see mvcmetamodel.Cell#getComponents()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Components();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see mvcmetamodel.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference list '{@link mvcmetamodel.Line#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see mvcmetamodel.Line#getCells()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Cells();

	/**
	 * Returns the meta object for class '{@link mvcmetamodel.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see mvcmetamodel.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for enum '{@link mvcmetamodel.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size</em>'.
	 * @see mvcmetamodel.Size
	 * @generated
	 */
	EEnum getSize();

	/**
	 * Returns the meta object for enum '{@link mvcmetamodel.Align <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align</em>'.
	 * @see mvcmetamodel.Align
	 * @generated
	 */
	EEnum getAlign();

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
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__INPUTS = eINSTANCE.getForm_Inputs();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__COMPONENTS = eINSTANCE.getForm_Components();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__TABLES = eINSTANCE.getForm_Tables();

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
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__BODY = eINSTANCE.getPage_Body();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__HEAD = eINSTANCE.getPage_Head();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.TextImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.WebAppImpl <em>Web App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.WebAppImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getWebApp()
		 * @generated
		 */
		EClass WEB_APP = eINSTANCE.getWebApp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APP__NAME = eINSTANCE.getWebApp_Name();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__PAGES = eINSTANCE.getWebApp_Pages();

		/**
		 * The meta object literal for the '<em><b>Start Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__START_PAGE = eINSTANCE.getWebApp_StartPage();

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
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LINES = eINSTANCE.getTable_Lines();

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
		 * The meta object literal for the '{@link mvcmetamodel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.ComponentImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENTS = eINSTANCE.getComponent_Components();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.BodyImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__CONTENTS = eINSTANCE.getBody_Contents();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.HeadImpl <em>Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.HeadImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getHead()
		 * @generated
		 */
		EClass HEAD = eINSTANCE.getHead();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD__TITLE = eINSTANCE.getHead_Title();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__COMPONENTS = eINSTANCE.getHead_Components();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.TitleImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__SIZE = eINSTANCE.getTitle_Size();

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
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__SIZE = eINSTANCE.getTextField_Size();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__MAX_LENGTH = eINSTANCE.getTextField_MaxLength();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.PasswordImpl <em>Password</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.PasswordImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getPassword()
		 * @generated
		 */
		EClass PASSWORD = eINSTANCE.getPassword();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.RadioButtonImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__VALUE = eINSTANCE.getRadioButton_Value();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.CheckBoxImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__VALUE = eINSTANCE.getCheckBox_Value();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.SubmitButtonImpl <em>Submit Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.SubmitButtonImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getSubmitButton()
		 * @generated
		 */
		EClass SUBMIT_BUTTON = eINSTANCE.getSubmitButton();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMIT_BUTTON__VALUE = eINSTANCE.getSubmitButton_Value();

		/**
		 * The meta object literal for the '<em><b>Success Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMIT_BUTTON__SUCCESS_TARGET = eINSTANCE.getSubmitButton_SuccessTarget();

		/**
		 * The meta object literal for the '<em><b>Error Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMIT_BUTTON__ERROR_TARGET = eINSTANCE.getSubmitButton_ErrorTarget();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.ParagrapheImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getParagraphe()
		 * @generated
		 */
		EClass PARAGRAPHE = eINSTANCE.getParagraphe();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.CellImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__CONTENT = eINSTANCE.getCell_Content();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__COMPONENTS = eINSTANCE.getCell_Components();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.LineImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__CELLS = eINSTANCE.getLine_Cells();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.impl.ContentImpl
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.Size <em>Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.Size
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getSize()
		 * @generated
		 */
		EEnum SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link mvcmetamodel.Align <em>Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvcmetamodel.Align
		 * @see mvcmetamodel.impl.MvcmetamodelPackageImpl#getAlign()
		 * @generated
		 */
		EEnum ALIGN = eINSTANCE.getAlign();

	}

} //MvcmetamodelPackage
