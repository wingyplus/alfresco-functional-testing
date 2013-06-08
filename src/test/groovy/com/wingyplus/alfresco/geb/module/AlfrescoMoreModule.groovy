package com.wingyplus.alfresco.geb.module

import geb.Module;

class AlfrescoMoreModule extends Module {

     static content = {
         users {
             $('button', id: endsWith('app_more-button')).click()
             $('a', id: endsWith('users')).click()
         }
     }
}
