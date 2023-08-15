// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class TrainingEvent
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject trainingEventMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.TrainingEvent";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		StartDate("StartDate"),
		EndDate("EndDate"),
		TotalNumberOfRegistrations("TotalNumberOfRegistrations"),
		TrainingEvent_Location("MyFirstModule.TrainingEvent_Location"),
		TrainingEvent_Teacher("MyFirstModule.TrainingEvent_Teacher"),
		TrainingEvent_Course("MyFirstModule.TrainingEvent_Course");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public TrainingEvent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TrainingEvent(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject trainingEventMendixObject)
	{
		if (trainingEventMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, trainingEventMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.trainingEventMendixObject = trainingEventMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TrainingEvent.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.TrainingEvent initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.TrainingEvent.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.TrainingEvent initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.TrainingEvent(context, mendixObject);
	}

	public static myfirstmodule.proxies.TrainingEvent load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.TrainingEvent.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.TrainingEvent> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.TrainingEvent.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate()
	{
		return getStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDate.toString());
	}

	/**
	 * Set value of StartDate
	 * @param startdate
	 */
	public final void setStartDate(java.util.Date startdate)
	{
		setStartDate(getContext(), startdate);
	}

	/**
	 * Set value of StartDate
	 * @param context
	 * @param startdate
	 */
	public final void setStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.StartDate.toString(), startdate);
	}

	/**
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate()
	{
		return getEndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndDate.toString());
	}

	/**
	 * Set value of EndDate
	 * @param enddate
	 */
	public final void setEndDate(java.util.Date enddate)
	{
		setEndDate(getContext(), enddate);
	}

	/**
	 * Set value of EndDate
	 * @param context
	 * @param enddate
	 */
	public final void setEndDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date enddate)
	{
		getMendixObject().setValue(context, MemberNames.EndDate.toString(), enddate);
	}

	/**
	 * @return value of TotalNumberOfRegistrations
	 */
	public final java.lang.Integer getTotalNumberOfRegistrations()
	{
		return getTotalNumberOfRegistrations(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalNumberOfRegistrations
	 */
	public final java.lang.Integer getTotalNumberOfRegistrations(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TotalNumberOfRegistrations.toString());
	}

	/**
	 * Set value of TotalNumberOfRegistrations
	 * @param totalnumberofregistrations
	 */
	public final void setTotalNumberOfRegistrations(java.lang.Integer totalnumberofregistrations)
	{
		setTotalNumberOfRegistrations(getContext(), totalnumberofregistrations);
	}

	/**
	 * Set value of TotalNumberOfRegistrations
	 * @param context
	 * @param totalnumberofregistrations
	 */
	public final void setTotalNumberOfRegistrations(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer totalnumberofregistrations)
	{
		getMendixObject().setValue(context, MemberNames.TotalNumberOfRegistrations.toString(), totalnumberofregistrations);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of TrainingEvent_Location
	 */
	public final myfirstmodule.proxies.Location getTrainingEvent_Location() throws com.mendix.core.CoreException
	{
		return getTrainingEvent_Location(getContext());
	}

	/**
	 * @param context
	 * @return value of TrainingEvent_Location
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Location getTrainingEvent_Location(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Location result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TrainingEvent_Location.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Location.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of TrainingEvent_Location
	 * @param trainingevent_location
	 */
	public final void setTrainingEvent_Location(myfirstmodule.proxies.Location trainingevent_location)
	{
		setTrainingEvent_Location(getContext(), trainingevent_location);
	}

	/**
	 * Set value of TrainingEvent_Location
	 * @param context
	 * @param trainingevent_location
	 */
	public final void setTrainingEvent_Location(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Location trainingevent_location)
	{
		if (trainingevent_location == null) {
			getMendixObject().setValue(context, MemberNames.TrainingEvent_Location.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.TrainingEvent_Location.toString(), trainingevent_location.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of TrainingEvent_Teacher
	 */
	public final myfirstmodule.proxies.Teacher getTrainingEvent_Teacher() throws com.mendix.core.CoreException
	{
		return getTrainingEvent_Teacher(getContext());
	}

	/**
	 * @param context
	 * @return value of TrainingEvent_Teacher
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Teacher getTrainingEvent_Teacher(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Teacher result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TrainingEvent_Teacher.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Teacher.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of TrainingEvent_Teacher
	 * @param trainingevent_teacher
	 */
	public final void setTrainingEvent_Teacher(myfirstmodule.proxies.Teacher trainingevent_teacher)
	{
		setTrainingEvent_Teacher(getContext(), trainingevent_teacher);
	}

	/**
	 * Set value of TrainingEvent_Teacher
	 * @param context
	 * @param trainingevent_teacher
	 */
	public final void setTrainingEvent_Teacher(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Teacher trainingevent_teacher)
	{
		if (trainingevent_teacher == null) {
			getMendixObject().setValue(context, MemberNames.TrainingEvent_Teacher.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.TrainingEvent_Teacher.toString(), trainingevent_teacher.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of TrainingEvent_Course
	 */
	public final myfirstmodule.proxies.Course getTrainingEvent_Course() throws com.mendix.core.CoreException
	{
		return getTrainingEvent_Course(getContext());
	}

	/**
	 * @param context
	 * @return value of TrainingEvent_Course
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Course getTrainingEvent_Course(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Course result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TrainingEvent_Course.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Course.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of TrainingEvent_Course
	 * @param trainingevent_course
	 */
	public final void setTrainingEvent_Course(myfirstmodule.proxies.Course trainingevent_course)
	{
		setTrainingEvent_Course(getContext(), trainingevent_course);
	}

	/**
	 * Set value of TrainingEvent_Course
	 * @param context
	 * @param trainingevent_course
	 */
	public final void setTrainingEvent_Course(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Course trainingevent_course)
	{
		if (trainingevent_course == null) {
			getMendixObject().setValue(context, MemberNames.TrainingEvent_Course.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.TrainingEvent_Course.toString(), trainingevent_course.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return trainingEventMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.TrainingEvent that = (myfirstmodule.proxies.TrainingEvent) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
