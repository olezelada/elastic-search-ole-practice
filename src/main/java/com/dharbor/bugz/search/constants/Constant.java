package com.dharbor.bugz.search.constants;

public final class Constant {

    private static final String CONSTRUCTOR_MSG = "Must not have constructor It is a utility class";

    private Constant() {
        throw new IllegalStateException(CONSTRUCTOR_MSG);
    }

    public static class IssueLogIndex {

        public static final String INDEX_NAME = "dhin_issue_issue-log_index";
        public static final String DOC_TYPE = "_doc";

        private IssueLogIndex() {
            throw new IllegalStateException(CONSTRUCTOR_MSG);
        }
    }

    public static class AttachmentLogIndex {

        public static final String INDEX_NAME = "dhin_gallery_attachment-log_index";
        public static final String DOC_TYPE = "_doc";

        private AttachmentLogIndex() {
            throw new IllegalStateException(CONSTRUCTOR_MSG);
        }
    }
}
