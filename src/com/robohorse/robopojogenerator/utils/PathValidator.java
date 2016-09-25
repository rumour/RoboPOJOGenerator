package com.robohorse.robopojogenerator.utils;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.psi.PsiDirectory;
import com.robohorse.robopojogenerator.errors.PathException;
import com.robohorse.robopojogenerator.errors.RoboPluginException;

/**
 * Created by vadim on 24.09.16.
 */
public class PathValidator {

    public PsiDirectory checkPath(AnActionEvent event) throws RoboPluginException {
        Object pathItem = event.getData(CommonDataKeys.NAVIGATABLE);
        if (pathItem != null) {
            if (pathItem instanceof PsiDirectory) {
                return (PsiDirectory) pathItem;
            }
        }
        throw new PathException();
    }
}