package br.com.concrete.plugins.projecttemplate.core.plugin.listeners

import br.com.concrete.plugins.projecttemplate.core.plugin.services.MyProjectService
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener

internal class MyProjectManagerListener : ProjectManagerListener {
	override fun projectOpened(project: Project) {
		projectInstance = project
		project.getService(MyProjectService::class.java)
	}

	override fun projectClosing(project: Project) {
		projectInstance = null
		super.projectClosing(project)
	}

	companion object {
		var projectInstance: Project? = null
	}
}
