package org.example;

public class LongestProjectCount {
    private String name;
    private int monthCount;

    public LongestProjectCount(String name, int monthCount) {
        this.name = name;
        this.monthCount = monthCount;
    }

    public String getName() {
        return this.name;
    }

    public int getMonthCount() {
        return this.monthCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LongestProjectCount)) return false;
        final LongestProjectCount other = (LongestProjectCount) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getMonthCount() != other.getMonthCount()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LongestProjectCount;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getMonthCount();
        return result;
    }

    public String toString() {
        return "LongestProjectCount(name=" + this.getName() + ", monthCount=" + this.getMonthCount() + ")";
    }
}
