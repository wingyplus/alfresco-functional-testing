package com.wingyplus.alfresco.geb.module

import geb.Module;

class AlfrescoUserButtonModule extends Module {
    static content = {
        logout {
            $('button[id$=user_user-button]').click()
            $('a[id$=logout]').click()
        }
    }
}