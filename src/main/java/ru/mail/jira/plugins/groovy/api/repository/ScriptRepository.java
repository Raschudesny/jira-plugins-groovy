package ru.mail.jira.plugins.groovy.api.repository;

import com.atlassian.jira.user.ApplicationUser;
import ru.mail.jira.plugins.groovy.api.dto.*;
import ru.mail.jira.plugins.groovy.api.dto.directory.*;

import java.util.List;

public interface ScriptRepository {
    List<ScriptDirectoryTreeDto> getAllDirectories();

    ScriptDirectoryDto getDirectory(int id);

    ScriptDirectoryDto createDirectory(ApplicationUser user, ScriptDirectoryForm form);

    ScriptDirectoryDto updateDirectory(ApplicationUser user, int id, ScriptDirectoryForm form);

    void deleteDirectory(ApplicationUser user, int id);

    List<RegistryScriptDto> getAllScripts(boolean includeChangelog);

    List<ScriptDescription> getAllScriptDescriptions();

    RegistryScriptDto getScript(int id, boolean includeChangelogs, boolean expandName);

    RegistryScriptDto createScript(ApplicationUser user, RegistryScriptForm scriptForm);

    RegistryScriptDto updateScript(ApplicationUser user, int id, RegistryScriptForm scriptForm);

    void deleteScript(ApplicationUser user, int id);
}