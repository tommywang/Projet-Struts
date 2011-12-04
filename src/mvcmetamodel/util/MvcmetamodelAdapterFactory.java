/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.util;

import mvcmetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mvcmetamodel.MvcmetamodelPackage
 * @generated
 */
public class MvcmetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MvcmetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MvcmetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MvcmetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MvcmetamodelSwitch modelSwitch =
		new MvcmetamodelSwitch() {
			public Object caseServletMapping(ServletMapping object) {
				return createServletMappingAdapter();
			}
			public Object caseServlet(Servlet object) {
				return createServletAdapter();
			}
			public Object caseForm(Form object) {
				return createFormAdapter();
			}
			public Object casePage(Page object) {
				return createPageAdapter();
			}
			public Object caseLabel(Label object) {
				return createLabelAdapter();
			}
			public Object caseTextField(TextField object) {
				return createTextFieldAdapter();
			}
			public Object caseInitParam(InitParam object) {
				return createInitParamAdapter();
			}
			public Object caseApplication(Application object) {
				return createApplicationAdapter();
			}
			public Object caseWebXML(WebXML object) {
				return createWebXMLAdapter();
			}
			public Object caseResourceRef(ResourceRef object) {
				return createResourceRefAdapter();
			}
			public Object caseWelcomeFileList(WelcomeFileList object) {
				return createWelcomeFileListAdapter();
			}
			public Object caseWelcomeFile(WelcomeFile object) {
				return createWelcomeFileAdapter();
			}
			public Object caseTable(Table object) {
				return createTableAdapter();
			}
			public Object caseLink(Link object) {
				return createLinkAdapter();
			}
			public Object caseComponent(Component object) {
				return createComponentAdapter();
			}
			public Object caseInput(Input object) {
				return createInputAdapter();
			}
			public Object caseResources(Resources object) {
				return createResourcesAdapter();
			}
			public Object caseJava(Java object) {
				return createJavaAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.ServletMapping <em>Servlet Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.ServletMapping
	 * @generated
	 */
	public Adapter createServletMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.Servlet <em>Servlet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.Servlet
	 * @generated
	 */
	public Adapter createServletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.TextField
	 * @generated
	 */
	public Adapter createTextFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.InitParam <em>Init Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.InitParam
	 * @generated
	 */
	public Adapter createInitParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.WebXML <em>Web XML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.WebXML
	 * @generated
	 */
	public Adapter createWebXMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.ResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.ResourceRef
	 * @generated
	 */
	public Adapter createResourceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.WelcomeFileList <em>Welcome File List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.WelcomeFileList
	 * @generated
	 */
	public Adapter createWelcomeFileListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.WelcomeFile <em>Welcome File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.WelcomeFile
	 * @generated
	 */
	public Adapter createWelcomeFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.Resources
	 * @generated
	 */
	public Adapter createResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mvcmetamodel.Java <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mvcmetamodel.Java
	 * @generated
	 */
	public Adapter createJavaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MvcmetamodelAdapterFactory
