package com.taobao.arthas.core.command.result;

/**
 * Command execute result
 *
 * @author gongdewei 2020-03-26
 */
public abstract class ExecResult {

    private Integer jobId;

    /**
     * Command type (name)
     *
     * @return
     */
    public abstract String getType();


    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }
}